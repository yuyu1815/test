/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\005\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H\002J\020\020\020\032\0020\0132\006\020\f\032\0020\rH\002J\020\020\021\032\0020\0132\006\020\f\032\0020\rH\002J\024\020\021\032\0020\0132\f\020\022\032\b\022\004\022\0020\r0\023R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\005XT¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTestPresentation;", "", "<init>", "()V", "MAX_FRAMES_PER_TESTS", "", "MAX_FAILED_TESTS_DISPLAY_COUNT", "MAX_LINES_PER_MESSAGE", "MAX_LINE_LENGTH", "MAX_LINES_PER_TESTS", "presentWithTrace", "", "failedTest", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTest;", "trace", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/StackTrace;", "presentWithoutTrace", "present", "failedTests", "", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nTestPresentationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTestPresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n774#2:226\n865#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTestPresentation\n*L\n76#1:226\n76#1:227,2\n*E\n"})
/*     */ public final class FailedTestPresentation
/*     */ {
/*     */   @NotNull
/*     */   public static final FailedTestPresentation INSTANCE = new FailedTestPresentation();
/*     */   private static final int MAX_FRAMES_PER_TESTS = 20;
/*     */   private static final int MAX_FAILED_TESTS_DISPLAY_COUNT = 5;
/*     */   private static final int MAX_LINES_PER_MESSAGE = 50;
/*     */   private static final int MAX_LINE_LENGTH = 700;
/*     */   private static final int MAX_LINES_PER_TESTS = 50;
/*     */   
/*     */   private final String presentWithTrace(FailedTest failedTest, StackTrace trace) {
/*  61 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$presentWithTrace_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-FailedTestPresentation$presentWithTrace$1 = 0;
/*  62 */     String message = TestPresentationUtilsKt.access$truncateMessageIfNeeded(trace.getMessage(), 50, 700);
/*  63 */     String str1 = TestPresentationUtilsKt.access$truncateTraceIfNeeded(trace.getFrames(), 20, 700);
/*     */     
/*  65 */     Intrinsics.checkNotNullExpressionValue($this$presentWithTrace_u24lambda_u240.append("#### Test `" + failedTest.getFullName() + "` failed with exception:"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$presentWithTrace_u24lambda_u240.append("#### Test `" + failedTest.getFullName() + "` failed with exception:").append('\n'), "append(...)"); $this$presentWithTrace_u24lambda_u240.append("#### Test `" + failedTest.getFullName() + "` failed with exception:").append('\n');
/*  66 */     Intrinsics.checkNotNullExpressionValue($this$presentWithTrace_u24lambda_u240.append(message), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$presentWithTrace_u24lambda_u240.append(message).append('\n'), "append(...)"); $this$presentWithTrace_u24lambda_u240.append(message).append('\n');
/*  67 */     Intrinsics.checkNotNullExpressionValue($this$presentWithTrace_u24lambda_u240.append(str1), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$presentWithTrace_u24lambda_u240.append(str1).append('\n'), "append(...)"); $this$presentWithTrace_u24lambda_u240.append(str1).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*  72 */   private final String presentWithoutTrace(FailedTest failedTest) { StringBuilder stringBuilder1 = new StringBuilder(), $this$presentWithoutTrace_u24lambda_u242 = stringBuilder1; int $i$a$-buildString-FailedTestPresentation$presentWithoutTrace$1 = 0;
/*  73 */     List lines = StringsKt.lines(failedTest.getUnfoldedOutput());
/*  74 */     String limitedLinesNote = (lines.size() <= 50) ? "" : ("(first 50 of " + lines.size() + " lines)");
/*  75 */     Intrinsics.checkNotNullExpressionValue($this$presentWithoutTrace_u24lambda_u242.append("#### Test `" + failedTest.getFullName() + "` failed with output " + limitedLinesNote + ":"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$presentWithoutTrace_u24lambda_u242.append("#### Test `" + failedTest.getFullName() + "` failed with output " + limitedLinesNote + ":").append('\n'), "append(...)"); $this$presentWithoutTrace_u24lambda_u242.append("#### Test `" + failedTest.getFullName() + "` failed with output " + limitedLinesNote + ":").append('\n');
/*  76 */     StringBuilder stringBuilder2 = $this$presentWithoutTrace_u24lambda_u242; Iterable $this$filter$iv = CollectionsKt.take(lines, 50); int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 227 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-FailedTestPresentation$presentWithoutTrace$1$1 = 0; if ((((CharSequence)it).length() > 0)) destination$iv$iv.add(element$iv$iv);  }
/* 228 */      Intrinsics.checkNotNullExpressionValue(stringBuilder2.append(CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null)), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder2.append(CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null)).append('\n'), "append(...)"); stringBuilder2.append(CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null)).append('\n'); Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)"); return stringBuilder1.toString(); } private final String present(FailedTest failedTest) { StackTrace topTrace = failedTest.getTopTrace(); if (topTrace != null) {
/* 229 */       StackTrace it = topTrace; int $i$a$-let-FailedTestPresentation$present$1 = 0;
/*     */       if (INSTANCE.presentWithTrace(failedTest, it) == null) {
/*     */         INSTANCE.presentWithTrace(failedTest, it);
/*     */         return presentWithoutTrace(failedTest);
/*     */       } 
/*     */       return INSTANCE.presentWithTrace(failedTest, it);
/*     */     } 
/*     */     INSTANCE.presentWithTrace(failedTest, it);
/*     */     return presentWithoutTrace(failedTest); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String present(@NotNull List failedTests) {
/*     */     Intrinsics.checkNotNullParameter(failedTests, "failedTests");
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$present_u24lambda_u247 = stringBuilder1;
/*     */     int $i$a$-buildString-FailedTestPresentation$present$2 = 0;
/*     */     List showedFailedTests = failedTests;
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append("Showed first 5 of " + failedTests.size() + " failed tests."), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append("Showed first 5 of " + failedTests.size() + " failed tests.").append('\n'), "append(...)");
/*     */     $this$present_u24lambda_u247.append("Showed first 5 of " + failedTests.size() + " failed tests.").append('\n');
/*     */     showedFailedTests = CollectionsKt.take(failedTests, 5);
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$4, 30, null)), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$4, 30, null)).append('\n'), "append(...)");
/*     */     $this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$4, 30, null)).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append("\n... and " + failedTests.size() - 5 + " more failed tests"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append("\n... and " + failedTests.size() - 5 + " more failed tests").append('\n'), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$5, 30, null)), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$5, 30, null)).append('\n'), "append(...)");
/*     */     (showedFailedTests.size() > 5) ? $this$present_u24lambda_u247.append("\n... and " + failedTests.size() - 5 + " more failed tests").append('\n') : $this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$5, 30, null)).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append('\n'), "append(...)");
/*     */     $this$present_u24lambda_u247.append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$6, 30, null)), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$6, 30, null)).append('\n'), "append(...)");
/*     */     $this$present_u24lambda_u247.append(CollectionsKt.joinToString$default(showedFailedTests, "\n", null, null, 0, null, FailedTestPresentation::present$lambda$7$lambda$6, 30, null)).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   private static final CharSequence present$lambda$7$lambda$4(FailedTest it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "- `" + it.getFullName() + "`";
/*     */   }
/*     */   
/*     */   private static final CharSequence present$lambda$7$lambda$5(FailedTest it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "- `" + it.getFullName() + "`";
/*     */   }
/*     */   
/*     */   private static final CharSequence present$lambda$7$lambda$6(FailedTest it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return INSTANCE.present(it);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\FailedTestPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */