/*    */ package com.intellij.ml.llm.matterhorn.activation.platform;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\032\037\020\000\032\b\022\004\022\002H\0020\001\"\n\b\000\020\002\030\001*\0020\003*\0020\004H\b\032 \020\000\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\003*\b\022\004\022\002H\0020\001¨\006\005"}, d2 = {"withMock", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "T", "", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion;", "platform"})
/*    */ public final class AiaServiceMockSupportKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> AiaServiceSupport<T> withMock(@NotNull AiaServiceSupport<? extends T> $this$withMock) {
/* 14 */     Intrinsics.checkNotNullParameter($this$withMock, "<this>"); return AiaServiceMockSupportRegistry.INSTANCE.getOrCreateMockSupportFor($this$withMock);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceMockSupportKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */