/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Result;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\000\032O\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\004\"\004\b\001\020\002\"\004\b\002\020\003*\b\022\004\022\002H\0040\0052\030\020\006\032\024\022\004\022\002H\004\022\004\022\002H\002\022\004\022\002H\0030\007H\000¢\006\002\020\b\032;\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\t0\005H\000¢\006\002\020\n\032\024\020\013\032\0020\f*\0020\r2\006\020\016\032\0020\017H\002¨\006\020"}, d2 = {"toOpResult", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "Err", "Val", "Ret", "Lkotlin/Result;", "resultMapper", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;", "(Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "fromCause", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$Companion;", "cause", "", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\nOpResultMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/*    */ public final class OpResultMapperKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <Ret, Err, Val> OpResult<Err, Val> toOpResult(@NotNull Object $this$toOpResult, @NotNull OpResultMapper resultMapper) {
/* 30 */     Intrinsics.checkNotNullParameter(resultMapper, "resultMapper"); Object object1 = $this$toOpResult, p0 = object1;
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
/* 46 */     int $i$a$-map-OpResultMapperKt$toOpResult$1 = 0; return toOpResult(Result.isSuccess-impl(object1) ? Result.constructor-impl(resultMapper.mapCompleted(p0)) : Result.constructor-impl(object1)); } @NotNull public static final <Err, Val> OpResult<Err, Val> toOpResult(@NotNull Object $this$toOpResult) { Throwable p0; Object object = $this$toOpResult; OpResult.OpTerminated.Companion companion = OpResult.OpTerminated.Companion; Result.exceptionOrNull-impl(object); int $i$a$-getOrElse-OpResultMapperKt$toOpResult$2 = 0;
/*    */     return (Result.exceptionOrNull-impl(object) == null) ? (OpResult<Err, Val>)object : (OpResult<Err, Val>)fromCause(companion, p0); }
/*    */ 
/*    */   
/*    */   private static final OpResult.OpTerminated fromCause(OpResult.OpTerminated.Companion $this$fromCause, Throwable cause) {
/*    */     Throwable throwable = cause;
/*    */     return (throwable instanceof kotlinx.coroutines.TimeoutCancellationException || throwable instanceof java.net.SocketTimeoutException) ? (OpResult.OpTerminated)new OpResult.OpTerminated.OpTimeout(cause) : ((throwable instanceof java.util.concurrent.CancellationException) ? (OpResult.OpTerminated)new OpResult.OpTerminated.OpCancellation(cause) : ((throwable instanceof java.io.IOException) ? (OpResult.OpTerminated)new OpResult.OpTerminated.OpNetworkFailure(cause) : (OpResult.OpTerminated)new OpResult.OpTerminated.OpUnhandledException(cause)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\OpResultMapperKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */