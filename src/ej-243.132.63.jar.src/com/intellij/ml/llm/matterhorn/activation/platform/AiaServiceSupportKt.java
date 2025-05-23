/*    */ package com.intellij.ml.llm.matterhorn.activation.platform;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\032(\020\000\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\003*\0020\0042\f\020\005\032\b\022\004\022\002H\0020\006¨\006\007"}, d2 = {"createForServiceInterface", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "T", "", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion;", "serviceInterface", "Lkotlin/reflect/KClass;", "platform"})
/*    */ public final class AiaServiceSupportKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> AiaServiceSupport<T> createForServiceInterface(@NotNull AiaServiceSupport.Companion $this$createForServiceInterface, @NotNull KClass<T> serviceInterface) {
/* 41 */     Intrinsics.checkNotNullParameter($this$createForServiceInterface, "<this>"); Intrinsics.checkNotNullParameter(serviceInterface, "serviceInterface"); return new AiaServiceSupportImpl<>(serviceInterface);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceSupportKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */