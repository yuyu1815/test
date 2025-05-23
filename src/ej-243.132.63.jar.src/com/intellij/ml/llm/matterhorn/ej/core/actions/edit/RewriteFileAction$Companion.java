/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\006\032\0020\0072\006\020\b\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion;", "", "<init>", "()V", "REWRITE_FILE_ACTION_NAME", "", "parseArgument", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "input", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nRewriteFileAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewriteFileAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n756#2,10:89\n*S KotlinDebug\n*F\n+ 1 RewriteFileAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion\n*L\n82#1:89,10\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final RewriteFileAction.RewriteFileParseResult parseArgument(@NotNull String input) {
/* 81 */     Intrinsics.checkNotNullParameter(input, "input"); List lines = StringsKt.lines(input);
/* 82 */     Iterable $this$dropWhile$iv = lines; int $i$f$dropWhile = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 89 */     boolean yielding$iv = false;
/* 90 */     ArrayList<Object> list$iv = new ArrayList();
/* 91 */     for (Object item$iv : $this$dropWhile$iv) {
/* 92 */       if (yielding$iv) {
/* 93 */         list$iv.add(item$iv); continue;
/* 94 */       }  String it = (String)item$iv; int $i$a$-dropWhile-RewriteFileAction$Companion$parseArgument$replacementTextLines$1 = 0; if (!((((CharSequence)StringsKt.trim(it).toString()).length() == 0) ? 1 : 0)) {
/* 95 */         list$iv.add(item$iv);
/* 96 */         yielding$iv = true;
/*    */       } 
/* 98 */     }  List<Object> replacementTextLines = list$iv;
/*    */     String replacementText = CollectionsKt.joinToString$default(replacementTextLines, "\n", null, null, 0, null, null, 62, null);
/*    */     return new RewriteFileAction.RewriteFileParseResult.Success(replacementText);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\RewriteFileAction$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */