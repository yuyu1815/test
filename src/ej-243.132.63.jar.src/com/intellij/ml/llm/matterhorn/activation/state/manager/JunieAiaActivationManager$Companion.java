/*    */ package com.intellij.ml.llm.matterhorn.activation.state.manager;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/manager/JunieAiaActivationManager$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/state/manager/JunieAiaActivationManager;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "state.manager"})
/*    */ @SourceDebugExtension({"SMAP\nJunieAiaActivationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAiaActivationManager.kt\ncom/intellij/ml/llm/matterhorn/activation/state/manager/JunieAiaActivationManager$Companion\n+ 2 AiaServiceSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion\n*L\n1#1,13:1\n35#2:14\n*S KotlinDebug\n*F\n+ 1 JunieAiaActivationManager.kt\ncom/intellij/ml/llm/matterhorn/activation/state/manager/JunieAiaActivationManager$Companion\n*L\n11#1:14\n*E\n"})
/*    */ public final class Companion implements AiaServiceSupport<JunieAiaActivationManager> {
/*    */   private Companion() {
/* 11 */     AiaServiceSupport.Companion this_$iv = AiaServiceSupport.Companion; int $i$f$invoke = 0; this.$$delegate_0 = 
/*    */ 
/*    */       
/* 14 */       AiaServiceSupportKt.createForServiceInterface(this_$iv, Reflection.getOrCreateKotlinClass(JunieAiaActivationManager.class));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public JunieAiaActivationManager syncInstance() {
/*    */     return (JunieAiaActivationManager)this.$$delegate_0.syncInstance();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object instance(@NotNull Continuation $completion) {
/*    */     return this.$$delegate_0.instance($completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Flow<JunieAiaActivationManager> instanceFlow() {
/*    */     return this.$$delegate_0.instanceFlow();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public KClass<? extends JunieAiaActivationManager> getKeyClass() {
/*    */     return this.$$delegate_0.getKeyClass();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\manager\JunieAiaActivationManager$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */