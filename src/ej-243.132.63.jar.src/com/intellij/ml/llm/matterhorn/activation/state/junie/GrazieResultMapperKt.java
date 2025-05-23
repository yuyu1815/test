/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\002\b\002\032K\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\003\"\004\b\001\020\002*\b\022\004\022\002H\0030\0012!\020\004\032\035\022\023\022\021H\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\002H\0020\005H\bø\001\000\032E\020\t\032\b\022\004\022\002H\0030\001\"\004\b\000\020\003*\b\022\004\022\002H\0030\0012!\020\n\032\035\022\023\022\0210\013¢\006\f\b\006\022\b\b\007\022\004\b\b(\f\022\004\022\0020\r0\005H\bø\001\000\032E\020\016\032\b\022\004\022\002H\0030\001\"\004\b\000\020\003*\b\022\004\022\002H\0030\0012!\020\n\032\035\022\023\022\021H\003¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\r0\005H\bø\001\000\002\007\n\005\b20\001¨\006\017"}, d2 = {"map", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "R", "T", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "onFailure", "action", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;", "failure", "", "onSuccess", "state.junie.impl"})
/*    */ public final class GrazieResultMapperKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T, R> GrazieResult<R> map(@NotNull GrazieResult<R> $this$map, @NotNull Function1 transform) {
/* 31 */     Intrinsics.checkNotNullParameter($this$map, "<this>"); Intrinsics.checkNotNullParameter(transform, "transform"); int $i$f$map = 0; GrazieResult<R> grazieResult = $this$map;
/*    */     
/* 33 */     if (grazieResult instanceof GrazieResult.GrazieSuccess) {
/*    */     
/*    */     } else {
/*    */       throw new NoWhenBranchMatchedException();
/* 37 */     }  return (grazieResult instanceof GrazieResult.GrazieFailure) ? $this$map : (GrazieResult<R>)"JD-Core does not support Kotlin"; } @NotNull public static final <T> GrazieResult<T> onFailure(@NotNull GrazieResult<T> $this$onFailure, @NotNull Function1 action) { Intrinsics.checkNotNullParameter($this$onFailure, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$onFailure = 0; GrazieResult<T> grazieResult1 = $this$onFailure, $this$onFailure_u24lambda_u240 = grazieResult1; int $i$a$-apply-GrazieResultMapperKt$onFailure$1 = 0;
/* 38 */     if ($this$onFailure_u24lambda_u240 instanceof GrazieResult.GrazieFailure) action.invoke($this$onFailure_u24lambda_u240); 
/*    */     return grazieResult1; } @NotNull
/*    */   public static final <T> GrazieResult<T> onSuccess(@NotNull GrazieResult<T> $this$onSuccess, @NotNull Function1 action) {
/* 41 */     Intrinsics.checkNotNullParameter($this$onSuccess, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$onSuccess = 0; GrazieResult<T> grazieResult1 = $this$onSuccess, $this$onSuccess_u24lambda_u241 = grazieResult1; int $i$a$-apply-GrazieResultMapperKt$onSuccess$1 = 0;
/* 42 */     if ($this$onSuccess_u24lambda_u241 instanceof GrazieResult.GrazieSuccess) action.invoke(((GrazieResult.GrazieSuccess)$this$onSuccess_u24lambda_u241).getValue()); 
/*    */     return grazieResult1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieResultMapperKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */