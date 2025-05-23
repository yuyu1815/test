/*    */ package com.intellij.ml.llm.matterhorn.activation.platform;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.util.ServiceKt;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.SuspendFunction;
/*    */ import kotlin.jvm.JvmClassMappingKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\025\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\004\b\006\020\007J\r\020\n\032\0028\000H\026¢\006\002\020\013J\016\020\f\032\0028\000H@¢\006\002\020\rJ\016\020\016\032\b\022\004\022\0028\0000\017H\026J\017\020\020\032\b\022\004\022\0028\0000\005HÆ\003J\037\020\021\032\b\022\004\022\0028\0000\0002\016\b\002\020\004\032\b\022\004\022\0028\0000\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\002HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\030HÖ\001R\032\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupportImpl;", "T", "", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "keyClass", "Lkotlin/reflect/KClass;", "<init>", "(Lkotlin/reflect/KClass;)V", "getKeyClass", "()Lkotlin/reflect/KClass;", "syncInstance", "()Ljava/lang/Object;", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "platform"})
/*    */ final class AiaServiceSupportImpl<T>
/*    */   implements AiaServiceSupport<T>
/*    */ {
/*    */   @NotNull
/*    */   private final KClass<T> keyClass;
/*    */   
/*    */   public AiaServiceSupportImpl(@NotNull KClass<T> keyClass) {
/* 45 */     this.keyClass = keyClass; } @NotNull public KClass<T> getKeyClass() { return this.keyClass; } @NotNull
/* 46 */   public T syncInstance() { Intrinsics.checkNotNullExpressionValue(ApplicationManager.getApplication().getService(JvmClassMappingKt.getJavaClass(getKeyClass())), "getService(...)"); return (T)ApplicationManager.getApplication().getService(JvmClassMappingKt.getJavaClass(getKeyClass())); } @Nullable
/* 47 */   public Object instance(@NotNull Continuation $completion) { Intrinsics.checkNotNullExpressionValue(ApplicationManager.getApplication(), "getApplication(...)"); return ServiceKt.getServiceAsync((ComponentManager)ApplicationManager.getApplication(), JvmClassMappingKt.getJavaClass(getKeyClass()), $completion); } @NotNull
/* 48 */   public Flow<T> instanceFlow() { return FlowKt.asFlow(new AiaServiceSupportImpl$instanceFlow$1(this)); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final KClass<T> component1() {
/*    */     return this.keyClass;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AiaServiceSupportImpl<T> copy(@NotNull KClass<T> keyClass) {
/*    */     Intrinsics.checkNotNullParameter(keyClass, "keyClass");
/*    */     return new AiaServiceSupportImpl(keyClass);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AiaServiceSupportImpl(keyClass=" + this.keyClass + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.keyClass.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AiaServiceSupportImpl))
/*    */       return false; 
/*    */     AiaServiceSupportImpl aiaServiceSupportImpl = (AiaServiceSupportImpl)other;
/*    */     return !!Intrinsics.areEqual(this.keyClass, aiaServiceSupportImpl.keyClass);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceSupportImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */