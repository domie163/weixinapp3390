<template>
	<view class="content">
		<view class="logo" v-if="false">
			<image :style='{"boxShadow":"0 0 0px #59f43e","borderColor":"rgba(51, 204, 51, 1)","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201207/bd5eec4088ef4635b9f9a27f03bc6c8b.jpg","isShow":false,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201207/bd5eec4088ef4635b9f9a27f03bc6c8b.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.xuehao" type="text" class="uni-input" name="" placeholder="学号" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="text" class="uni-input" name="" placeholder="确认密码" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.xueshengxingming" type="text" class="uni-input" name="" placeholder="学生姓名" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker  @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                <view :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.nianling" type="text" class="uni-input" name="" placeholder="年龄" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.lianxifangshi" type="text" class="uni-input" name="" placeholder="联系方式" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.yuanxi" type="text" class="uni-input" name="" placeholder="院系" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker  @change="xueshengxuanxiukechengChange" :value="xueshengxuanxiukechengIndex" :range="xueshengxuanxiukechengOptions">
                                <view :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xuanxiukecheng?ruleForm.xuanxiukecheng:"请选择选修课程"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.jiaoshigonghao" type="text" class="uni-input" name="" placeholder="教师工号" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="text" class="uni-input" name="" placeholder="确认密码" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.jiaoshixingming" type="text" class="uni-input" name="" placeholder="教师姓名" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
                        <picker  @change="jiaoshixingbieChange" :value="jiaoshixingbieIndex" :range="jiaoshixingbieOptions">
                                <view :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
                        <picker  @change="jiaoshizhichengChange" :value="jiaoshizhichengIndex" :range="jiaoshizhichengOptions">
                                <view :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zhicheng?ruleForm.zhicheng:"请选择职称"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'  v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
                        <picker  @change="jiaoshisuojiaokechengChange" :value="jiaoshisuojiaokechengIndex" :range="jiaoshisuojiaokechengOptions">
                                <view :style='{"borderColor":"rgba(121, 186, 121, 1)","backgroundColor":"#fff","borderRadius":"16rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.suojiaokecheng?ruleForm.suojiaokecheng:"请选择所教课程"}}</view>
                        </picker>
                </view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(51, 204, 51, 1)","borderRadius":"40rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"2rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                xueshengxingbieOptions: [],
                                xueshengxingbieIndex: 0,
                                xueshengxuanxiukechengOptions: [],
                                xueshengxuanxiukechengIndex: 0,
                                jiaoshixingbieOptions: [],
                                jiaoshixingbieIndex: 0,
                                jiaoshizhichengOptions: [],
                                jiaoshizhichengIndex: 0,
                                jiaoshisuojiaokechengOptions: [],
                                jiaoshisuojiaokechengIndex: 0,
				ruleForm: {
				},
				emailcode: "",
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='xuesheng'){
                this.xueshengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.xueshengxingbieOptions[0]
			}
			if(this.tableName=='xuesheng'){
                        	res = await this.$api.option(`kechengleibie`,`kechengleibie`,{});
                        	this.xueshengxuanxiukechengOptions = res.data;
				this.ruleForm.xuanxiukecheng=this.xueshengxuanxiukechengOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jiaoshi'){
                this.jiaoshixingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.jiaoshixingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jiaoshi'){
                this.jiaoshizhichengOptions = "助教,讲师,副教授,教授".split(',');
				this.ruleForm.zhicheng=this.jiaoshizhichengOptions[0]
			}
			if(this.tableName=='jiaoshi'){
                        	res = await this.$api.option(`kechengleibie`,`kechengleibie`,{});
                        	this.jiaoshisuojiaokechengOptions = res.data;
				this.ruleForm.suojiaokecheng=this.jiaoshisuojiaokechengOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

                        // 下拉变化
                        xueshengxingbieChange(e) {
                                this.xueshengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
                        },
                        // 下拉变化
                        xueshengxuanxiukechengChange(e) {
                                this.xueshengxuanxiukechengIndex = e.target.value
                                this.ruleForm.xuanxiukecheng = this.xueshengxuanxiukechengOptions[this.xueshengxuanxiukechengIndex]
                        },
                        // 下拉变化
                        jiaoshixingbieChange(e) {
                                this.jiaoshixingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jiaoshixingbieOptions[this.jiaoshixingbieIndex]
                        },
                        // 下拉变化
                        jiaoshizhichengChange(e) {
                                this.jiaoshizhichengIndex = e.target.value
                                this.ruleForm.zhicheng = this.jiaoshizhichengOptions[this.jiaoshizhichengIndex]
                        },
                        // 下拉变化
                        jiaoshisuojiaokechengChange(e) {
                                this.jiaoshisuojiaokechengIndex = e.target.value
                                this.ruleForm.suojiaokecheng = this.jiaoshisuojiaokechengOptions[this.jiaoshisuojiaokechengIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.xuehao) && `xuesheng` == this.tableName){
					this.$utils.msg(`学号不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && (this.ruleForm.xuehao.length<3)){
					this.$utils.msg(`学号长度不能小于3`);
					return
				}
				if(`xuesheng` == this.tableName && (this.ruleForm.xuehao.length>10)){
					this.$utils.msg(`学号长度不能大于10`);
					return
				}
				if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && (this.ruleForm.mima.length<3)){
					this.$utils.msg(`密码长度不能小于3`);
					return
				}
				if(`xuesheng` == this.tableName && (this.ruleForm.mima.length>10)){
					this.$utils.msg(`密码长度不能大于10`);
					return
				}
				if(`xuesheng` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
					this.$utils.msg(`两次密码输入不一致`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
				if((!this.ruleForm.jiaoshigonghao) && `jiaoshi` == this.tableName){
					this.$utils.msg(`教师工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiaoshi` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
					this.$utils.msg(`两次密码输入不一致`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm, this.emailcode);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
