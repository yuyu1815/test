/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupportKt;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeBuildInfoRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeBuildInfoRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*    */ @SourceDebugExtension({"SMAP\nJunieIdeBuildInfoRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieIdeBuildInfoRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeBuildInfoRepository$Companion\n+ 2 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportKt\n*L\n1#1,24:1\n10#2:25\n*S KotlinDebug\n*F\n+ 1 JunieIdeBuildInfoRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeBuildInfoRepository$Companion\n*L\n13#1:25\n*E\n"})
/*    */ public final class Companion implements AiaServiceSupport<JunieIdeBuildInfoRepository> {
/*    */   private Companion() {
/* 13 */     AiaServiceSupport.Companion $this$withMock$iv = AiaServiceSupport.Companion; int $i$f$withMock = 0; this.$$delegate_0 = 
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
/* 25 */       AiaServiceMockSupportKt.withMock(AiaServiceSupportKt.createForServiceInterface(AiaServiceSupport.Companion, Reflection.getOrCreateKotlinClass(JunieIdeBuildInfoRepository.class)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public JunieIdeBuildInfoRepository syncInstance() {
/*    */     return (JunieIdeBuildInfoRepository)this.$$delegate_0.syncInstance();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object instance(@NotNull Continuation $completion) {
/*    */     return this.$$delegate_0.instance($completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Flow<JunieIdeBuildInfoRepository> instanceFlow() {
/*    */     return this.$$delegate_0.instanceFlow();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public KClass<? extends JunieIdeBuildInfoRepository> getKeyClass() {
/*    */     return this.$$delegate_0.getKeyClass();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieIdeBuildInfoRepository$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */