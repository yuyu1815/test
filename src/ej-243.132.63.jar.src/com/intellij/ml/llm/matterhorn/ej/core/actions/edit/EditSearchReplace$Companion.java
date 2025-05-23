/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\f\032\0020\r2\006\020\016\032\0020\0052\b\020\017\032\004\030\0010\020H\002J\n\020\021\032\0020\005*\0020\022J\n\020\023\032\0020\005*\0020\022J\032\020\024\032\0020\005*\0020\0222\006\020\025\032\0020\0052\006\020\026\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000R\016\020\013\032\0020\005XT¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;", "", "<init>", "()V", "SEARCH_REPLACE_ACTION_NAME", "", "REVIEW_MESSAGE", "FILE_UPDATED_MESSAGE", "FILE_CREATED_MESSAGE", "BAD_QOUTES_MESSAGE", "SEARCH_REPLACE_COMMON_DOCSTRING_PART", "EDIT_ARGUMENT", "parseSearchReplace", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;", "arguments", "overrideParsedFileBy", "Lcom/intellij/openapi/vfs/VirtualFile;", "getSuccessEditMessage", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;", "getEditWithIssuesMessage", "getMessage", "codeBefore", "codeAfter", "ej-core"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   private final SearchReplaceParseResult parseSearchReplace(String arguments, VirtualFile overrideParsedFileBy) {
/* 396 */     AgentUtilsKt.toNioPathOrNull(overrideParsedFileBy); List<Edit> edits = EditSearchReplaceKt.findOriginalUpdateBlocksXML(arguments, (overrideParsedFileBy != null && AgentUtilsKt.toNioPathOrNull(overrideParsedFileBy) != null) ? AgentUtilsKt.toNioPathOrNull(overrideParsedFileBy).toString() : null);
/* 397 */     if (!edits.isEmpty()) {
/* 398 */       return new SearchReplaceParseResult.Success(edits);
/*     */     }
/* 400 */     return new SearchReplaceParseResult.Error(
/*     */ 
/*     */ 
/*     */         
/* 404 */         StringsKt.trimMargin$default("ERROR: failed to find *SEARCH/REPLACE* blocks in your input:\n                    |```\n                    |" + arguments + "\n                    |```", null, 1, null));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getSuccessEditMessage(@NotNull EditType $this$getSuccessEditMessage) {
/* 409 */     Intrinsics.checkNotNullParameter($this$getSuccessEditMessage, "<this>"); switch (WhenMappings.$EnumSwitchMapping$0[$this$getSuccessEditMessage.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String getEditWithIssuesMessage(@NotNull EditType $this$getEditWithIssuesMessage) {
/* 416 */     Intrinsics.checkNotNullParameter($this$getEditWithIssuesMessage, "<this>"); String revertMessage = "Please revert changes using `undo_edit` or edit the file again to correct following issues:\n";
/* 417 */     switch (WhenMappings.$EnumSwitchMapping$0[$this$getEditWithIssuesMessage.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   @NotNull
/*     */   public final String getMessage(@NotNull EditType $this$getMessage, @NotNull String codeBefore, @NotNull String codeAfter) {
/*     */     StringBuilder stringBuilder1, $this$getMessage_u24lambda_u240, $this$getMessage_u24lambda_u241;
/*     */     int $i$a$-buildString-EditSearchReplace$Companion$getMessage$1, $i$a$-buildString-EditSearchReplace$Companion$getMessage$2;
/* 423 */     Intrinsics.checkNotNullParameter($this$getMessage, "<this>"); Intrinsics.checkNotNullParameter(codeBefore, "codeBefore"); Intrinsics.checkNotNullParameter(codeAfter, "codeAfter"); switch (WhenMappings.$EnumSwitchMapping$0[$this$getMessage.ordinal()]) { case 1:
/* 424 */         $this$getMessage_u24lambda_u240 = stringBuilder1 = new StringBuilder(); $i$a$-buildString-EditSearchReplace$Companion$getMessage$1 = 0;
/* 425 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN `search_replace` PARAMETERS AND TRY AGAIN."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN `search_replace` PARAMETERS AND TRY AGAIN.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN `search_replace` PARAMETERS AND TRY AGAIN.").append('\n');
/* 426 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append('\n');
/* 427 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is how your edit would have looked if applied:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is how your edit would have looked if applied:").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("This is how your edit would have looked if applied:").append('\n');
/* 428 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 429 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeAfter), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeAfter).append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append(codeAfter).append('\n');
/* 430 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 431 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is the original code before your edit:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("This is the original code before your edit:").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("This is the original code before your edit:").append('\n');
/* 432 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 433 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeBefore), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append(codeBefore).append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append(codeBefore).append('\n');
/* 434 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("-------------------------------------------------").append('\n');
/* 435 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("Your changes have NOT been applied. Please fix your edit command and try again."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u240.append("Your changes have NOT been applied. Please fix your edit command and try again.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u240.append("Your changes have NOT been applied. Please fix your edit command and try again.").append('\n');
/*     */         Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */       case 2:
/* 438 */         $this$getMessage_u24lambda_u241 = stringBuilder1 = new StringBuilder(); $i$a$-buildString-EditSearchReplace$Companion$getMessage$2 = 0;
/* 439 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN CONTENT BLOCKS AND TRY AGAIN."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN CONTENT BLOCKS AND TRY AGAIN.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("NONE OF YOUR EDITS HAVE BEEN APPLIED. FIX PROBLEMS IN CONTENT BLOCKS AND TRY AGAIN.").append('\n');
/* 440 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append('\n');
/* 441 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("This is how your edit would have looked if applied:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("This is how your edit would have looked if applied:").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("This is how your edit would have looked if applied:").append('\n');
/* 442 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n');
/* 443 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append(codeAfter), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append(codeAfter).append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append(codeAfter).append('\n');
/* 444 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("-------------------------------------------------").append('\n');
/* 445 */         Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("Your changes have NOT been applied. Please fix your create command and try again."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$getMessage_u24lambda_u241.append("Your changes have NOT been applied. Please fix your create command and try again.").append('\n'), "append(...)"); $this$getMessage_u24lambda_u241.append("Your changes have NOT been applied. Please fix your create command and try again.").append('\n');
/*     */         Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); }
/*     */     
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSearchReplace$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */