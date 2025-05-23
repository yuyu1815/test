/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.request.UtilsKt;
/*     */ import io.ktor.http.ContentType;
/*     */ import io.ktor.http.HttpMessageBuilder;
/*     */ import io.ktor.http.HttpMessagePropertiesKt;
/*     */ import io.ktor.http.HttpMethod;
/*     */ import io.ktor.http.content.NullBody;
/*     */ import io.ktor.util.reflect.TypeInfo;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.reflect.KType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nLlmProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$createRequest$builder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,124:1\n1863#2,2:125\n16#3,4:127\n21#3,10:149\n65#4,18:131\n*S KotlinDebug\n*F\n+ 1 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$createRequest$builder$1\n*L\n83#1:125,2\n86#1:127,4\n86#1:149,10\n86#1:131,18\n*E\n"})
/*     */ public final class AnthropicChatRequest$executeRequest$$inlined$createRequest$1
/*     */   implements Function1<HttpRequestBuilder, Unit>
/*     */ {
/*     */   public final void invoke(HttpRequestBuilder $this$request) {
/*  81 */     Intrinsics.checkNotNullParameter($this$request, "$this$request"); HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$request, ContentType.Application.INSTANCE.getJson());
/*  82 */     UtilsKt.accept((HttpMessageBuilder)$this$request, ContentType.Text.INSTANCE.getEventStream());
/*  83 */     Iterable $this$forEach$iv = this.$additionalHeaders; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Pair pair = (Pair)element$iv; int $i$a$-forEach-LlmProviderKt$createRequest$builder$1$1 = 0; String name = (String)pair.component1(), value = (String)pair.component2(); $this$request.getHeaders().append(name, value); }
/*     */      $this$request.setMethod(HttpMethod.Companion.getPost()); HttpRequestBuilder httpRequestBuilder = $this$request; Object body$iv = this.$body; int $i$f$setBody = 0;
/* 127 */     Object object1 = body$iv;
/* 128 */     if (object1 == null) {
/* 129 */       KType kType1; httpRequestBuilder.setBody(NullBody.INSTANCE);
/* 130 */       HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0;
/* 131 */       KClass kClass1 = Reflection.getOrCreateKotlinClass(AnthropicChatRequestBody.class); int $i$f$typeOfOrNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 145 */         kType1 = Reflection.typeOf(AnthropicChatRequestBody.class);
/* 146 */       } catch (Throwable <unused var>$iv$iv$iv) {
/* 147 */         kType1 = null;
/* 148 */       }  KType kType2 = kType1; KClass kClass2 = kClass1; httpRequestBuilder1.setBodyType(new TypeInfo(kClass2, kType2));
/* 149 */     } else if (object1 instanceof io.ktor.http.content.OutgoingContent) {
/* 150 */       httpRequestBuilder.setBody(body$iv);
/* 151 */       httpRequestBuilder.setBodyType(null);
/*     */     } else {
/*     */       
/* 154 */       httpRequestBuilder.setBody(body$iv);
/* 155 */       HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0;
/*     */       KClass kClass = Reflection.getOrCreateKotlinClass(AnthropicChatRequestBody.class);
/*     */       int $i$f$typeOfOrNull = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnthropicChatRequest$executeRequest$$inlined$createRequest$1(List $additionalHeaders, Object $body) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest$executeRequest$$inlined$createRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */