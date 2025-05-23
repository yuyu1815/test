/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import io.ktor.http.HttpMessageBuilder;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlin.reflect.KType;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\tH@¢\006\002\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest;", "", "<init>", "()V", "send", "Lio/ktor/client/statement/HttpResponse;", "requestBody", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;", "modelUrl", "", "modelKey", "(Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nOpenAiImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAiImageRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt\n+ 4 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,25:1\n40#2,3:26\n52#3:29\n16#4,4:30\n21#4,10:52\n65#5,18:34\n*S KotlinDebug\n*F\n+ 1 OpenAiImageRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest\n*L\n11#1:26,3\n21#1:29\n17#1:30,4\n17#1:52,10\n17#1:34,18\n*E\n"})
/*    */ public final class OpenAiImageRequest {
/*    */   private static final Unit send$lambda$1$lambda$0(String $modelUrl, String $modelKey, OpenAiImageRequestBody $requestBody, HttpRequestBuilder $this$request) {
/* 13 */     Intrinsics.checkNotNullParameter($this$request, "$this$request"); HttpRequestKt.url($this$request, $modelUrl);
/* 14 */     UtilsKt.accept((HttpMessageBuilder)$this$request, ContentType.Text.INSTANCE.getEventStream());
/* 15 */     HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$request, ContentType.Application.INSTANCE.getJson());
/* 16 */     UtilsKt.bearerAuth((HttpMessageBuilder)$this$request, $modelKey);
/* 17 */     HttpRequestBuilder $this$setBody$iv = $this$request; int $i$f$setBody = 0;
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
/* 30 */     OpenAiImageRequestBody openAiImageRequestBody = $requestBody;
/* 31 */     if (openAiImageRequestBody == null) {
/* 32 */       KType kType1; $this$setBody$iv.setBody(NullBody.INSTANCE);
/* 33 */       HttpRequestBuilder httpRequestBuilder = $this$setBody$iv; int $i$f$typeInfo = 0;
/* 34 */       KClass kClass1 = Reflection.getOrCreateKotlinClass(OpenAiImageRequestBody.class); int $i$f$typeOfOrNull = 0;
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
/*    */       try {
/* 48 */         kType1 = Reflection.typeOf(OpenAiImageRequestBody.class);
/* 49 */       } catch (Throwable <unused var>$iv$iv$iv) {
/* 50 */         kType1 = null;
/* 51 */       }  KType kType2 = kType1; KClass kClass2 = kClass1; httpRequestBuilder.setBodyType(new TypeInfo(kClass2, kType2));
/* 52 */     } else if (openAiImageRequestBody instanceof io.ktor.http.content.OutgoingContent) {
/* 53 */       $this$setBody$iv.setBody($requestBody);
/* 54 */       $this$setBody$iv.setBodyType(null);
/*    */     } else {
/*    */       
/* 57 */       $this$setBody$iv.setBody($requestBody);
/* 58 */       HttpRequestBuilder httpRequestBuilder = $this$setBody$iv; int $i$f$typeInfo = 0;
/*    */       KClass kClass = Reflection.getOrCreateKotlinClass(OpenAiImageRequestBody.class);
/*    */       int $i$f$typeOfOrNull = 0;
/*    */     } 
/*    */     $this$request.setMethod(HttpMethod.Companion.getPost());
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object send(@NotNull OpenAiImageRequestBody requestBody, @NotNull String modelUrl, @NotNull String modelKey, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest$send$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest$send$1
/*    */     //   13: astore #13
/*    */     //   15: aload #13
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #13
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest$send$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #13
/*    */     //   53: aload #13
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #12
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #14
/*    */     //   65: aload #13
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 263, 0 -> 92, 1 -> 245
/*    */     //   92: aload #12
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: iconst_0
/*    */     //   98: istore #5
/*    */     //   100: ldc com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService
/*    */     //   102: astore #6
/*    */     //   104: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   107: aload #6
/*    */     //   109: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*    */     //   114: dup
/*    */     //   115: ifnonnull -> 182
/*    */     //   118: pop
/*    */     //   119: new java/lang/RuntimeException
/*    */     //   122: dup
/*    */     //   123: new java/lang/StringBuilder
/*    */     //   126: dup
/*    */     //   127: invokespecial <init> : ()V
/*    */     //   130: ldc 'Cannot find service '
/*    */     //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   135: aload #6
/*    */     //   137: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   143: ldc ' (classloader='
/*    */     //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   148: aload #6
/*    */     //   150: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*    */     //   153: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   156: ldc ', client='
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*    */     //   164: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*    */     //   167: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   170: bipush #41
/*    */     //   172: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   175: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   178: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   181: athrow
/*    */     //   182: nop
/*    */     //   183: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService
/*    */     //   186: invokevirtual getClient : ()Lio/ktor/client/HttpClient;
/*    */     //   189: astore #6
/*    */     //   191: iconst_0
/*    */     //   192: istore #7
/*    */     //   194: aload_2
/*    */     //   195: aload_3
/*    */     //   196: aload_1
/*    */     //   197: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;)Lkotlin/jvm/functions/Function1;
/*    */     //   202: invokestatic request : (Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   205: astore #8
/*    */     //   207: aload #6
/*    */     //   209: astore #9
/*    */     //   211: iconst_0
/*    */     //   212: istore #10
/*    */     //   214: new io/ktor/client/statement/HttpStatement
/*    */     //   217: dup
/*    */     //   218: aload #8
/*    */     //   220: aload #9
/*    */     //   222: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*    */     //   225: aload #13
/*    */     //   227: aload #13
/*    */     //   229: iconst_1
/*    */     //   230: putfield label : I
/*    */     //   233: invokevirtual execute : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   236: dup
/*    */     //   237: aload #14
/*    */     //   239: if_acmpne -> 255
/*    */     //   242: aload #14
/*    */     //   244: areturn
/*    */     //   245: iconst_0
/*    */     //   246: istore #7
/*    */     //   248: aload #12
/*    */     //   250: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   253: aload #12
/*    */     //   255: checkcast io/ktor/client/statement/HttpResponse
/*    */     //   258: astore #11
/*    */     //   260: aload #11
/*    */     //   262: areturn
/*    */     //   263: new java/lang/IllegalStateException
/*    */     //   266: dup
/*    */     //   267: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   269: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   272: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 63
/*    */     //   #11	-> 97
/*    */     //   #26	-> 100
/*    */     //   #27	-> 104
/*    */     //   #28	-> 119
/*    */     //   #27	-> 182
/*    */     //   #11	-> 186
/*    */     //   #12	-> 194
/*    */     //   #21	-> 207
/*    */     //   #29	-> 214
/*    */     //   #21	-> 227
/*    */     //   #10	-> 242
/*    */     //   #22	-> 260
/*    */     //   #10	-> 263
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	22	1	requestBody	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;
/*    */     //   182	1	1	requestBody	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;
/*    */     //   183	24	1	requestBody	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;
/*    */     //   97	22	2	modelUrl	Ljava/lang/String;
/*    */     //   182	1	2	modelUrl	Ljava/lang/String;
/*    */     //   183	24	2	modelUrl	Ljava/lang/String;
/*    */     //   97	22	3	modelKey	Ljava/lang/String;
/*    */     //   182	1	3	modelKey	Ljava/lang/String;
/*    */     //   183	24	3	modelKey	Ljava/lang/String;
/*    */     //   104	79	6	serviceClass$iv	Ljava/lang/Class;
/*    */     //   191	20	6	client	Lio/ktor/client/HttpClient;
/*    */     //   207	18	8	requestBuilder	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   211	14	9	$this$prepareRequest$iv	Lio/ktor/client/HttpClient;
/*    */     //   260	3	11	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   100	83	5	$i$f$service	I
/*    */     //   214	11	10	$i$f$prepareRequest	I
/*    */     //   194	51	7	$i$a$-let-OpenAiImageRequest$send$2	I
/*    */     //   0	273	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	210	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	203	12	$result	Ljava/lang/Object;
/*    */     //   248	15	7	$i$a$-let-OpenAiImageRequest$send$2	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "OpenAiImageRequest.kt", l = {21}, i = {}, s = {}, n = {}, m = "send", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAiImageRequest")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class OpenAiImageRequest$send$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     OpenAiImageRequest$send$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return OpenAiImageRequest.this.send(null, null, null, (Continuation<? super HttpResponse>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAiImageRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */