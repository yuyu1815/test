/*    */ package com.intellij.ml.llm.matterhorn.activation.platform;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\033\020\004\032\b\022\004\022\002H\0060\005\"\n\b\001\020\006\030\001*\0020\001H\bJ$\020\004\032\b\022\004\022\002H\0060\005\"\b\b\001\020\006*\0020\0012\f\020\007\032\b\022\004\022\002H\0060\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupport$Companion;", "", "<init>", "()V", "getRegisteredInstance", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupport;", "T", "serviceSupport", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "platform"})
/*    */ @SourceDebugExtension({"SMAP\nAiaServiceMockSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupport$Companion\n+ 2 AiaServiceSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion\n*L\n1#1,73:1\n35#2:74\n*S KotlinDebug\n*F\n+ 1 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupport$Companion\n*L\n23#1:74\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final <T> AiaServiceMockSupport<T> getRegisteredInstance(@NotNull AiaServiceSupport<? extends T> serviceSupport) {
/* 27 */     Intrinsics.checkNotNullParameter(serviceSupport, "serviceSupport"); return AiaServiceMockSupportRegistry.INSTANCE.getRegisteredMutableMockSupportFor(serviceSupport);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceMockSupport$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */