/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J$\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH@¢\006\002\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation;", "", "<init>", "()V", "present", "", "results", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nTestPresentationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n808#2,11:226\n1368#2:237\n1454#2,5:238\n808#2,11:243\n*S KotlinDebug\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation\n*L\n208#1:226,11\n210#1:237\n210#1:238,5\n216#1:243,11\n*E\n"})
/*     */ public final class RunResultPresentation
/*     */ {
/*     */   @NotNull
/*     */   public static final RunResultPresentation INSTANCE = new RunResultPresentation();
/*     */   
/*     */   @Nullable
/*     */   public final Object present(@NotNull List results, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/* 207 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$present_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-RunResultPresentation$present$2 = 0;
/* 208 */     Iterable $this$filterIsInstance$iv = results; int $i$f$filterIsInstance = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     Iterable iterable2 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 235 */     for (Object element$iv$iv : iterable2) { if (element$iv$iv instanceof BuildFailed) destination$iv$iv.add(element$iv$iv);  }
/* 236 */      List buildFailedResults = (List)destination$iv$iv; if (!buildFailedResults.isEmpty()) {
/* 237 */       Iterable $this$flatMap$iv = buildFailedResults; int $i$f$flatMap = 0; Iterable iterable3 = $this$flatMap$iv; Collection collection = new ArrayList(); int $i$f$flatMapTo = 0;
/* 238 */       for (Object element$iv$iv : iterable3) {
/* 239 */         BuildFailed it = (BuildFailed)element$iv$iv; int $i$a$-flatMap-RunResultPresentation$present$2$messages$1 = 0; Iterable<BuildMessage> list$iv$iv = it.getMessages();
/* 240 */         CollectionsKt.addAll(collection, list$iv$iv);
/*     */       } 
/* 242 */       List<BuildMessage> messages = (List)collection; String presentation = BuildFailedMessagesPresentation.INSTANCE.present(messages, false); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append(presentation), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append(presentation).append('\n'), "append(...)"); $this$present_u24lambda_u241.append(presentation).append('\n'); Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append('\n'), "append(...)"); $this$present_u24lambda_u241.append('\n');
/* 243 */     }  Iterable iterable1 = results; int i = 0; Iterable $this$flatMapTo$iv$iv = iterable1; Collection<Object> collection1 = new ArrayList(); int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 252 */     for (Object element$iv$iv : $this$flatMapTo$iv$iv) { if (element$iv$iv instanceof TestsResult) collection1.add(element$iv$iv);  }
/* 253 */      List<TestsResult> testsResults = (List)collection1;
/*     */     if (!testsResults.isEmpty()) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append("## Test Results"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append("## Test Results").append('\n'), "append(...)");
/*     */       $this$present_u24lambda_u241.append("## Test Results").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append(TestResultPresentation.INSTANCE.present(testsResults)), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append(TestResultPresentation.INSTANCE.present(testsResults)).append('\n'), "append(...)");
/*     */       $this$present_u24lambda_u241.append(TestResultPresentation.INSTANCE.present(testsResults)).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u241.append('\n'), "append(...)");
/*     */       $this$present_u24lambda_u241.append('\n');
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\RunResultPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */