/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.json.Json;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\0322\020\000\032\0020\001*\0020\0012\b\b\002\020\002\032\0020\0032\026\b\004\020\004\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005H\bø\001\000\0328\020\007\032\0020\001\"\006\b\000\020\b\030\001*\0020\0012\b\b\002\020\002\032\0020\0032\024\b\004\020\004\032\016\022\004\022\002H\b\022\004\022\0020\t0\005H\bø\001\000\002\007\n\005\b20\001¨\006\n"}, d2 = {"addSimpleReviewer", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilder;", "strategy", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "reviewer", "Lkotlin/Function1;", "", "addJsonReviewer", "T", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;", "core"})
/*    */ public final class GrazieRequestBuilderExKt {
/*    */   @NotNull
/* 11 */   public static final GrazieRequestBuilder addSimpleReviewer(@NotNull GrazieRequestBuilder $this$addSimpleReviewer, @NotNull ReviewStrategy strategy, @NotNull Function1<? super String, String> reviewer) { Intrinsics.checkNotNullParameter($this$addSimpleReviewer, "<this>"); Intrinsics.checkNotNullParameter(strategy, "strategy"); Intrinsics.checkNotNullParameter(reviewer, "reviewer"); int $i$f$addSimpleReviewer = 0; return $this$addSimpleReviewer.addReviewer(strategy, new GrazieRequestBuilderExKt$addSimpleReviewer$1(reviewer)); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nGrazieRequestBuilderEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestBuilderEx.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilderExKt$addSimpleReviewer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"}) public static final class GrazieRequestBuilderExKt$addSimpleReviewer$1 implements AssistantMessageReviewer { public GrazieRequestBuilderExKt$addSimpleReviewer$1(Function1<String, String> $reviewer) {} public final Object review(String message, Continuation $completion) { String it = (String)this.$reviewer.invoke(message);
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
/* 28 */       int $i$a$-let-GrazieRequestBuilderExKt$addSimpleReviewer$1$1 = 0; (String)this.$reviewer.invoke(message); return ((String)this.$reviewer.invoke(message) != null) ? new ReviewResult.Error(it) : ReviewResult.Companion.getSuccess(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 176) public static final class GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1 extends ContinuationImpl { int label; public GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1(Continuation $completion) { super($completion); } public final Object invokeSuspend(Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return GrazieRequestBuilderExKt$addSimpleReviewer$1.this.review(null, (Continuation<? super ReviewResult>)this); } } public final Object review$$forInline(String message, Continuation<? super GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1> $completion) { InlineMarker.mark(4); InlineMarker.mark(5); new GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1($completion); String str = (String)this.$reviewer.invoke(message); if (str != null) { String str1 = str, it = str1; int $i$a$-let-GrazieRequestBuilderExKt$addSimpleReviewer$1$1 = 0; }  return ReviewResult.Companion.getSuccess(); } } @Metadata(mv = {2, 1, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nGrazieRequestBuilderEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestBuilderEx.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilderExKt$addJsonReviewer$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,27:1\n222#2:28\n*S KotlinDebug\n*F\n+ 1 GrazieRequestBuilderEx.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilderExKt$addJsonReviewer$1\n*L\n17#1:28\n*E\n"}) public static final class GrazieRequestBuilderExKt$addJsonReviewer$1 implements AssistantMessageReviewer { public GrazieRequestBuilderExKt$addJsonReviewer$1(Function1<T, ReviewResult> $reviewer) {} public final Object review(String it, Continuation $completion) { Object object1; try { Json this_$iv = (Json)Json.Default; int $i$f$decodeFromString = 0; SerializersModule serializersModule = this_$iv.getSerializersModule(); Intrinsics.reifiedOperationMarker(6, "T"); MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule"); object1 = this_$iv.decodeFromString((DeserializationStrategy)SerializersKt.serializer(serializersModule, null), it); } catch (SerializationException e) { return new ReviewResult.Error("Invalid JSON: " + e.getMessage()); } catch (IllegalArgumentException e) { return new ReviewResult.Error("JSON doesn't match expected format: " + e.getMessage()); }  Object value = object1; return this.$reviewer.invoke(value); } public final Object review$$forInline(String it, Continuation<? super GrazieRequestBuilderExKt$addJsonReviewer$1$review$1> $completion) { Json json; InlineMarker.mark(4); InlineMarker.mark(5); new GrazieRequestBuilderExKt$addJsonReviewer$1$review$1($completion); try { json = (Json)Json.Default; int $i$f$decodeFromString = 0; SerializersModule serializersModule = json.getSerializersModule(); Intrinsics.reifiedOperationMarker(6, "T"); MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule"); }
/*    */       catch (SerializationException e)
/*    */       { return new ReviewResult.Error("Invalid JSON: " + e.getMessage()); }
/*    */       catch (IllegalArgumentException e)
/*    */       { return new ReviewResult.Error("JSON doesn't match expected format: " + e.getMessage()); }
/*    */       
/*    */       Object value = json;
/*    */       return this.$reviewer.invoke(value); }
/*    */ 
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*    */     public static final class GrazieRequestBuilderExKt$addJsonReviewer$1$review$1 extends ContinuationImpl {
/*    */       int label;
/*    */       
/*    */       public GrazieRequestBuilderExKt$addJsonReviewer$1$review$1(Continuation $completion) {
/*    */         super($completion);
/*    */       }
/*    */       
/*    */       public final Object invokeSuspend(Object $result) {
/*    */         this.result = $result;
/*    */         this.label |= Integer.MIN_VALUE;
/*    */         return GrazieRequestBuilderExKt$addJsonReviewer$1.this.review(null, (Continuation<? super ReviewResult>)this);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequestBuilderExKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */