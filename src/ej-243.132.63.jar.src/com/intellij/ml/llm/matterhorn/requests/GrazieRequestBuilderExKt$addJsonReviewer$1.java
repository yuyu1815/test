/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.InlineMarker;
/*    */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*    */ import kotlinx.serialization.SerializationException;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import kotlinx.serialization.modules.SerializersModule;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*    */ @SourceDebugExtension({"SMAP\nGrazieRequestBuilderEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestBuilderEx.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilderExKt$addJsonReviewer$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,27:1\n222#2:28\n*S KotlinDebug\n*F\n+ 1 GrazieRequestBuilderEx.kt\ncom/intellij/ml/llm/matterhorn/requests/GrazieRequestBuilderExKt$addJsonReviewer$1\n*L\n17#1:28\n*E\n"})
/*    */ public final class GrazieRequestBuilderExKt$addJsonReviewer$1 implements AssistantMessageReviewer {
/*    */   public GrazieRequestBuilderExKt$addJsonReviewer$1(Function1<T, ReviewResult> $reviewer) {}
/*    */   
/*    */   public final Object review(String it, Continuation $completion) { Object object1;
/*    */     
/* 17 */     try { Json this_$iv = (Json)Json.Default; int $i$f$decodeFromString = 0;
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
/* 28 */       SerializersModule serializersModule = this_$iv.getSerializersModule(); Intrinsics.reifiedOperationMarker(6, "T"); MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule"); object1 = this_$iv.decodeFromString((DeserializationStrategy)SerializersKt.serializer(serializersModule, null), it); } catch (SerializationException e) { return new ReviewResult.Error("Invalid JSON: " + e.getMessage()); } catch (IllegalArgumentException e) { return new ReviewResult.Error("JSON doesn't match expected format: " + e.getMessage()); }  Object value = object1; return this.$reviewer.invoke(value); } public final Object review$$forInline(String it, Continuation<? super GrazieRequestBuilderExKt$addJsonReviewer$1$review$1> $completion) { Json json; InlineMarker.mark(4); InlineMarker.mark(5); new GrazieRequestBuilderExKt$addJsonReviewer$1$review$1($completion); try { json = (Json)Json.Default; int $i$f$decodeFromString = 0; SerializersModule serializersModule = json.getSerializersModule(); Intrinsics.reifiedOperationMarker(6, "T"); MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule"); }
/*    */     catch (SerializationException e)
/*    */     { return new ReviewResult.Error("Invalid JSON: " + e.getMessage()); }
/*    */     catch (IllegalArgumentException e)
/*    */     { return new ReviewResult.Error("JSON doesn't match expected format: " + e.getMessage()); }
/*    */     
/*    */     Object value = json;
/*    */     return this.$reviewer.invoke(value); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*    */   public static final class GrazieRequestBuilderExKt$addJsonReviewer$1$review$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     public GrazieRequestBuilderExKt$addJsonReviewer$1$review$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GrazieRequestBuilderExKt$addJsonReviewer$1.this.review(null, (Continuation<? super ReviewResult>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequestBuilderExKt$addJsonReviewer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */