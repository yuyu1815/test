/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\f\020\t\032\b\022\004\022\0020\n0\0072\f\020\013\032\b\022\004\022\0020\f0\007H\002J\024\020\004\032\0020\0052\f\020\r\032\b\022\004\022\0020\0160\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/TestResultPresentation;", "", "<init>", "()V", "present", "", "passedTests", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/PassedTest;", "failedTests", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTest;", "buildMessages", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/BuildMessage;", "results", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/TestsResult;", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nTestPresentationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/TestResultPresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1368#2:226\n1454#2,5:227\n1663#2,8:232\n1053#2:240\n1368#2:241\n1454#2,5:242\n1663#2,8:247\n1053#2:255\n1368#2:256\n1454#2,5:257\n*S KotlinDebug\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/TestResultPresentation\n*L\n153#1:226\n153#1:227,5\n153#1:232,8\n153#1:240\n154#1:241\n154#1:242,5\n154#1:247,8\n154#1:255\n155#1:256\n155#1:257,5\n*E\n"})
/*     */ public final class TestResultPresentation
/*     */ {
/*     */   @NotNull
/*     */   public static final TestResultPresentation INSTANCE = new TestResultPresentation();
/*     */   
/*     */   private final String present(List<PassedTest> passedTests, List<FailedTest> failedTests, List<BuildMessage> buildMessages) {
/* 122 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$present_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-TestResultPresentation$present$1 = 0;
/* 123 */     if (passedTests.isEmpty() && failedTests.isEmpty()) {
/* 124 */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("There are no passed or failed tests."), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("There are no passed or failed tests.").append('\n'), "append(...)"); $this$present_u24lambda_u240.append("There are no passed or failed tests.").append('\n');
/*     */     }
/*     */     else {
/*     */       
/* 128 */       if (!buildMessages.isEmpty()) {
/* 129 */         Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append(BuildFailedMessagesPresentation.INSTANCE.present(buildMessages, true)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append(BuildFailedMessagesPresentation.INSTANCE.present(buildMessages, true)).append('\n'), "append(...)"); $this$present_u24lambda_u240.append(BuildFailedMessagesPresentation.INSTANCE.present(buildMessages, true)).append('\n');
/*     */       } 
/*     */       
/* 132 */       int totalPassed = passedTests.size();
/* 133 */       int totalFailed = failedTests.size();
/* 134 */       int totalTests = totalPassed + totalFailed;
/* 135 */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("### Test Results Summary"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("### Test Results Summary").append('\n'), "append(...)"); $this$present_u24lambda_u240.append("### Test Results Summary").append('\n');
/* 136 */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("- Passed tests: " + totalPassed + " / " + totalTests), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("- Passed tests: " + totalPassed + " / " + totalTests).append('\n'), "append(...)"); $this$present_u24lambda_u240.append("- Passed tests: " + totalPassed + " / " + totalTests).append('\n');
/* 137 */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("- Failed tests: " + totalFailed + " / " + totalTests), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("- Failed tests: " + totalFailed + " / " + totalTests).append('\n'), "append(...)"); $this$present_u24lambda_u240.append("- Failed tests: " + totalFailed + " / " + totalTests).append('\n');
/* 138 */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append('\n'), "append(...)"); $this$present_u24lambda_u240.append('\n');
/*     */       
/* 140 */       if (!passedTests.isEmpty()) {
/* 141 */         Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("### Passed Tests"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("### Passed Tests").append('\n'), "append(...)"); $this$present_u24lambda_u240.append("### Passed Tests").append('\n');
/* 142 */         Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append(PassedTestPresentation.INSTANCE.present(passedTests)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append(PassedTestPresentation.INSTANCE.present(passedTests)).append('\n'), "append(...)"); $this$present_u24lambda_u240.append(PassedTestPresentation.INSTANCE.present(passedTests)).append('\n');
/*     */       } 
/*     */       
/* 145 */       if (!failedTests.isEmpty()) {
/* 146 */         Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("### Failed Tests"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append("### Failed Tests").append('\n'), "append(...)"); $this$present_u24lambda_u240.append("### Failed Tests").append('\n');
/* 147 */         Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append(FailedTestPresentation.INSTANCE.present(failedTests)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u240.append(FailedTestPresentation.INSTANCE.present(failedTests)).append('\n'), "append(...)"); $this$present_u24lambda_u240.append(FailedTestPresentation.INSTANCE.present(failedTests)).append('\n');
/*     */       } 
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString(); } @NotNull
/*     */   public final String present(@NotNull List results) {
/* 153 */     Intrinsics.checkNotNullParameter(results, "results"); Iterable $this$flatMap$iv = results; int $i$f$flatMap = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     Iterable iterable4 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 227 */     for (Object element$iv$iv : iterable4) {
/* 228 */       TestsResult it = (TestsResult)element$iv$iv; int $i$a$-flatMap-TestResultPresentation$present$passedTests$1 = 0; Iterable<PassedTest> list$iv$iv = it.getPassed();
/* 229 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */     } 
/* 231 */     $this$flatMap$iv = destination$iv$iv; int $i$f$distinctBy = 0;
/* 232 */     HashSet set$iv = new HashSet();
/* 233 */     ArrayList list$iv = new ArrayList();
/* 234 */     for (Object e$iv : $this$flatMap$iv) {
/* 235 */       PassedTest it = (PassedTest)e$iv; int $i$a$-distinctBy-TestResultPresentation$present$passedTests$2 = 0; Object key$iv = it.getFullName();
/*     */     } 
/*     */ 
/*     */     
/* 239 */     Iterable $this$distinctBy$iv = list$iv; int $i$f$sortedBy = 0;
/* 240 */     List<PassedTest> passedTests = CollectionsKt.sortedWith($this$distinctBy$iv, new TestResultPresentation$present$$inlined$sortedBy$1()); Iterable iterable2 = results; int k = 0;
/* 241 */     Iterable iterable5 = iterable2; Collection collection1 = new ArrayList(); int n = 0;
/* 242 */     for (Object element$iv$iv : iterable5) {
/* 243 */       TestsResult it = (TestsResult)element$iv$iv; int $i$a$-flatMap-TestResultPresentation$present$failedTests$1 = 0; Iterable<FailedTest> list$iv$iv = it.getFailed();
/* 244 */       CollectionsKt.addAll(collection1, list$iv$iv);
/*     */     } 
/* 246 */     iterable2 = collection1; int j = 0;
/* 247 */     HashSet hashSet1 = new HashSet();
/* 248 */     ArrayList arrayList1 = new ArrayList();
/* 249 */     for (Object e$iv : iterable2) {
/* 250 */       FailedTest it = (FailedTest)e$iv; int $i$a$-distinctBy-TestResultPresentation$present$failedTests$2 = 0; Object key$iv = it.getFullName();
/*     */     } 
/*     */ 
/*     */     
/* 254 */     Iterable iterable1 = arrayList1; int i = 0;
/* 255 */     List<FailedTest> failedTests = CollectionsKt.sortedWith(iterable1, new TestResultPresentation$present$$inlined$sortedBy$2()); Iterable iterable3 = results; int m = 0;
/* 256 */     Iterable iterable6 = iterable3; Collection collection2 = new ArrayList(); int i1 = 0;
/* 257 */     for (Object element$iv$iv : iterable6) {
/* 258 */       TestsResult it = (TestsResult)element$iv$iv; int $i$a$-flatMap-TestResultPresentation$present$buildMessages$1 = 0; Iterable<BuildMessage> list$iv$iv = it.getBuildErrorMessages();
/* 259 */       CollectionsKt.addAll(collection2, list$iv$iv);
/*     */     } 
/* 261 */     List<BuildMessage> buildMessages = (List)collection2;
/*     */     return present(passedTests, failedTests, buildMessages);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\TestResultPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */