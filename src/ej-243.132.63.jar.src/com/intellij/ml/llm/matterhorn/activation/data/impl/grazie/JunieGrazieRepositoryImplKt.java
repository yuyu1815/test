/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*     */ 
/*     */ import ai.grazie.utils.mpp.time.Timestamp;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlinx.datetime.Instant;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\032=\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\003\"\004\b\001\020\002*\002H\0032\027\020\004\032\023\022\004\022\002H\003\022\004\022\002H\0020\005¢\006\002\b\006H\b¢\006\002\020\007\032\f\020\b\032\0020\t*\0020\nH\002¨\006\013"}, d2 = {"runCatchingGrazie", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "R", "T", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "toInstant", "Lkotlinx/datetime/Instant;", "Lai/grazie/utils/mpp/time/Timestamp;", "data.impl.grazie"})
/*     */ public final class JunieGrazieRepositoryImplKt
/*     */ {
/*     */   private static final <T, R> GrazieResult<R> runCatchingGrazie(Object $this$runCatchingGrazie, Function1 block) {
/*     */     Object object2;
/* 103 */     int $i$f$runCatchingGrazie = 0; Object object1 = $this$runCatchingGrazie; try { object2 = object1; int $i$a$-runCatching-JunieGrazieRepositoryImplKt$runCatchingGrazie$1 = 0; object2 = Result.constructor-impl(
/* 104 */           block.invoke(object2)); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }
/* 105 */      return GrazieResultUtilKt.toGrazieResult(object2);
/*     */   }
/*     */   private static final Instant toInstant(Timestamp $this$toInstant) {
/* 108 */     return Instant.Companion.fromEpochMilliseconds($this$toInstant.getMillis());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieRepositoryImplKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */