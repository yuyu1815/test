/*    */ package com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise;
/*    */ 
/*    */ import com.intellij.platform.ide.provisioner.ProvisionedServiceConfigurationResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "JunieAieProvisionRepositoryImpl.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise.JunieAieProvisionRepositoryImpl$configurationState$3")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceConfigurationResult;"})
/*    */ final class JunieAieProvisionRepositoryImpl$configurationState$3
/*    */   extends SuspendLambda
/*    */   implements Function2<ProvisionedServiceConfigurationResult, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieAieProvisionRepositoryImpl$configurationState$3(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ProvisionedServiceConfigurationResult it;
/* 45 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (ProvisionedServiceConfigurationResult)this.L$0;
/* 46 */         JunieAieProvisionRepositoryImplKt.access$getLOG$p().debug("AI service configuration: " + it);
/* 47 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieAieProvisionRepositoryImpl$configurationState$3> $completion) {
/*    */     JunieAieProvisionRepositoryImpl$configurationState$3 junieAieProvisionRepositoryImpl$configurationState$3 = new JunieAieProvisionRepositoryImpl$configurationState$3($completion);
/*    */     junieAieProvisionRepositoryImpl$configurationState$3.L$0 = value;
/*    */     return (Continuation<Unit>)junieAieProvisionRepositoryImpl$configurationState$3;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProvisionedServiceConfigurationResult p1, Continuation<?> p2) {
/*    */     return ((JunieAieProvisionRepositoryImpl$configurationState$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\enterprise\JunieAieProvisionRepositoryImpl$configurationState$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */