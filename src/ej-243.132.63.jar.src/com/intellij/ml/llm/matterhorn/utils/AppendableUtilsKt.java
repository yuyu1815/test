/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0004\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\034\n\000\n\002\020\r\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\b\003\032t\020\000\032\0060\001j\002`\002\"\004\b\000\020\003*\0060\001j\002`\0022\f\020\004\032\b\022\004\022\002H\0030\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\00720\020\n\032,\022\b\022\0060\001j\002`\002\022\023\022\021H\003¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\0020\0170\013¢\006\002\b\020\032t\020\021\032\0060\001j\002`\002\"\004\b\000\020\003*\b\022\004\022\002H\0030\0052\n\020\022\032\0060\001j\002`\0022\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\00720\020\n\032,\022\b\022\0060\001j\002`\002\022\023\022\021H\003¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\0020\0170\013¢\006\002\b\020¨\006\023"}, d2 = {"appendJoined", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "T", "values", "", "separator", "", "prefix", "postfix", "appendElement", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "element", "", "Lkotlin/ExtensionFunctionType;", "appendJoinedTo", "appendable", "core"})
/*    */ @SourceDebugExtension({"SMAP\nappendableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 appendableUtils.kt\ncom/intellij/ml/llm/matterhorn/utils/AppendableUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n1872#2,3:27\n*S KotlinDebug\n*F\n+ 1 appendableUtils.kt\ncom/intellij/ml/llm/matterhorn/utils/AppendableUtilsKt\n*L\n19#1:27,3\n*E\n"})
/*    */ public final class AppendableUtilsKt {
/*    */   @NotNull
/*    */   public static final <T> Appendable appendJoined(@NotNull Appendable $this$appendJoined, @NotNull Iterable<?> values, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2<? super Appendable, ?, Unit> appendElement) {
/*  9 */     Intrinsics.checkNotNullParameter($this$appendJoined, "<this>"); Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(appendElement, "appendElement"); return appendJoinedTo(values, $this$appendJoined, separator, prefix, postfix, appendElement);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> Appendable appendJoinedTo(@NotNull Iterable $this$appendJoinedTo, @NotNull Appendable appendable, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2 appendElement) {
/* 18 */     Intrinsics.checkNotNullParameter($this$appendJoinedTo, "<this>"); Intrinsics.checkNotNullParameter(appendable, "appendable"); Intrinsics.checkNotNullParameter(separator, "separator"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(postfix, "postfix"); Intrinsics.checkNotNullParameter(appendElement, "appendElement"); appendable.append(prefix);
/* 19 */     Iterable $this$forEachIndexed$iv = $this$appendJoinedTo; int $i$f$forEachIndexed = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     int index$iv = 0;
/* 28 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  Object object1 = item$iv; int index = i, $i$a$-forEachIndexed-AppendableUtilsKt$appendJoinedTo$1 = 0;
/*    */       if (index > 0)
/*    */         appendable.append(separator);  }
/*    */     
/*    */     appendable.append(postfix);
/*    */     return appendable;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhor\\utils\AppendableUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */