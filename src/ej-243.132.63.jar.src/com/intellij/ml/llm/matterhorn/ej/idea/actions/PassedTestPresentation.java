/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\n0\tR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/PassedTestPresentation;", "", "<init>", "()V", "MAX_PASSED_TESTS_DISPLAY_COUNT", "", "present", "", "passedTests", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/PassedTest;", "ej-idea"})
/*     */ public final class PassedTestPresentation
/*     */ {
/*     */   @NotNull
/*     */   public static final PassedTestPresentation INSTANCE = new PassedTestPresentation();
/*     */   private static final int MAX_PASSED_TESTS_DISPLAY_COUNT = 10;
/*     */   
/*     */   @NotNull
/*     */   public final String present(@NotNull List passedTests) {
/* 106 */     Intrinsics.checkNotNullParameter(passedTests, "passedTests"); StringBuilder stringBuilder1 = new StringBuilder(), $this$present_u24lambda_u242 = stringBuilder1; int $i$a$-buildString-PassedTestPresentation$present$1 = 0;
/* 107 */     int totalPassed = passedTests.size();
/*     */     
/* 109 */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append("Showing first 10 of " + totalPassed + " passed tests:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append("Showing first 10 of " + totalPassed + " passed tests:").append('\n'), "append(...)"); $this$present_u24lambda_u242.append("Showing first 10 of " + totalPassed + " passed tests:").append('\n');
/* 110 */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append(CollectionsKt.joinToString$default(CollectionsKt.take(passedTests, 10), "\n", null, null, 0, null, PassedTestPresentation::present$lambda$2$lambda$0, 30, null)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append(CollectionsKt.joinToString$default(CollectionsKt.take(passedTests, 10), "\n", null, null, 0, null, PassedTestPresentation::present$lambda$2$lambda$0, 30, null)).append('\n'), "append(...)"); $this$present_u24lambda_u242.append(CollectionsKt.joinToString$default(CollectionsKt.take(passedTests, 10), "\n", null, null, 0, null, PassedTestPresentation::present$lambda$2$lambda$0, 30, null)).append('\n');
/* 111 */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append("\n... and " + totalPassed - 10 + " more passed tests"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append("\n... and " + totalPassed - 10 + " more passed tests").append('\n'), "append(...)");
/*     */     
/* 113 */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append(CollectionsKt.joinToString$default(passedTests, "\n", null, null, 0, null, PassedTestPresentation::present$lambda$2$lambda$1, 30, null)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u242.append(CollectionsKt.joinToString$default(passedTests, "\n", null, null, 0, null, PassedTestPresentation::present$lambda$2$lambda$1, 30, null)).append('\n'), "append(...)"); (totalPassed > 10) ? $this$present_u24lambda_u242.append("\n... and " + totalPassed - 10 + " more passed tests").append('\n') : $this$present_u24lambda_u242.append(CollectionsKt.joinToString$default(passedTests, "\n", null, null, 0, null, PassedTestPresentation::present$lambda$2$lambda$1, 30, null)).append('\n'); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); } private static final CharSequence present$lambda$2$lambda$1(PassedTest it) { Intrinsics.checkNotNullParameter(it, "it"); return "- `" + it.getFullName() + "`"; }
/*     */ 
/*     */   
/*     */   private static final CharSequence present$lambda$2$lambda$0(PassedTest it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "- `" + it.getFullName() + "`";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\PassedTestPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */