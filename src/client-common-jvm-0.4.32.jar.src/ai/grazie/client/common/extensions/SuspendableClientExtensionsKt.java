/*    */ package ai.grazie.client.common.extensions;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000L\n\002\b\002\n\002\020\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\002\n\000\032:\020\000\032\002H\001\"\n\b\000\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHH¢\006\002\020\n\032n\020\013\032\b\022\004\022\002H\0010\f\"\n\b\000\020\r\030\001*\0020\002\"\n\b\001\020\001\030\001*\0020\016*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\016\b\002\020\020\032\b\022\004\022\002H\0010\0212\b\b\002\020\022\032\0020\0232\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHH¢\006\002\020\024\032l\020\025\032\b\022\004\022\002H\0010\f\"\n\b\000\020\r\030\001*\0020\002\"\n\b\001\020\001\030\001*\0020\016*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\f\020\020\032\b\022\004\022\002H\0010\0212\b\b\002\020\022\032\0020\0232\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHH¢\006\002\020\024\032,\020\026\032\0020\027*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\0020\0052\b\b\002\020\006\032\0020\007H@¢\006\002\020\030\032B\020\031\032\0020\027\"\n\b\000\020\r\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHH¢\006\002\020\032\032N\020\031\032\0020\027\"\b\b\000\020\r*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\f\020\033\032\b\022\004\022\002H\r0\0212\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH@¢\006\002\020\034\032$\020\031\032\0020\027*\0020\0032\006\020\035\032\0020\0052\b\b\002\020\006\032\0020\007H@¢\006\002\020\036\032B\020\037\032\0020 \"\n\b\000\020\r\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHH¢\006\002\020\032\032N\020\037\032\0020 \"\b\b\000\020\r*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\017\032\002H\r2\f\020\033\032\b\022\004\022\002H\r0\0212\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH@¢\006\002\020\034\032$\020\037\032\0020 *\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H@¢\006\002\020\036¨\006!"}, d2 = {"get", "O", "", "Lai/grazie/client/common/SuspendableHTTPClient;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "I", "Lai/grazie/model/cloud/sse/continuous/Data;", "content", "serializer", "Lkotlinx/serialization/KSerializer;", "reconnect", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;ZLai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSEV2", "send", "Lai/grazie/client/common/model/HTTPResponse;", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndGet", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "input", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndWait", "", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendableClientExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,107:1\n28#2:108\n28#2:136\n49#3:109\n51#3:113\n49#3:114\n51#3:118\n49#3:119\n51#3:123\n51#3:125\n49#3:126\n51#3:130\n49#3:131\n51#3:135\n49#3:137\n51#3:141\n49#3:142\n51#3:146\n49#3:147\n51#3:151\n49#3:152\n51#3:156\n49#3:157\n51#3:161\n49#3:162\n51#3:166\n46#4:110\n51#4:112\n46#4:115\n51#4:117\n46#4:120\n51#4:122\n51#4:124\n46#4:127\n51#4:129\n46#4:132\n51#4:134\n46#4:138\n51#4:140\n46#4:143\n51#4:145\n46#4:148\n51#4:150\n46#4:153\n51#4:155\n46#4:158\n51#4:160\n46#4:163\n51#4:165\n105#5:111\n105#5:116\n105#5:121\n105#5:128\n105#5:133\n105#5:139\n105#5:144\n105#5:149\n105#5:154\n105#5:159\n105#5:164\n*S KotlinDebug\n*F\n+ 1 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n86#1:108\n101#1:136\n87#1:109\n87#1:113\n89#1:114\n89#1:118\n90#1:119\n90#1:123\n87#1:125\n89#1:126\n89#1:130\n90#1:131\n90#1:135\n102#1:137\n102#1:141\n104#1:142\n104#1:146\n105#1:147\n105#1:151\n102#1:152\n102#1:156\n104#1:157\n104#1:161\n105#1:162\n105#1:166\n87#1:110\n87#1:112\n89#1:115\n89#1:117\n90#1:120\n90#1:122\n87#1:124\n89#1:127\n89#1:129\n90#1:132\n90#1:134\n102#1:138\n102#1:140\n104#1:143\n104#1:145\n105#1:148\n105#1:150\n102#1:153\n102#1:155\n104#1:158\n104#1:160\n105#1:163\n105#1:165\n87#1:111\n89#1:116\n90#1:121\n89#1:128\n90#1:133\n102#1:139\n104#1:144\n105#1:149\n102#1:154\n104#1:159\n105#1:164\n*E\n"})
/*    */ public final class SuspendableClientExtensionsKt {
/*    */   @Nullable
/*    */   public static final Object send(@NotNull SuspendableHTTPClient $this$send, @NotNull String url, @NotNull String content, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 14 */     return $this$send.send(url, StringsKt.encodeToByteArray(content), options, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final <I> Object sendAndGet(@NotNull SuspendableHTTPClient $this$sendAndGet, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation<? super HTTPResponse> $completion) {
/* 24 */     String serialized = json.string((SerializationStrategy)input, content);
/* 25 */     return send($this$sendAndGet, url, serialized, options, $completion);
/*    */   }
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
/*    */   @Nullable
/*    */   public static final Object sendAndGet(@NotNull SuspendableHTTPClient $this$sendAndGet, @NotNull String api, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 41 */     return $this$sendAndGet.send(api, options, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public static final Object sendAndWait(@NotNull SuspendableHTTPClient $this$sendAndWait, @NotNull String url, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 45 */     if ($this$sendAndWait.send(url, options, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return $this$sendAndWait.send(url, options, $completion);  $this$sendAndWait.send(url, options, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final <I> Object sendAndWait(@NotNull SuspendableHTTPClient $this$sendAndWait, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull RequestOptions options, @NotNull JSON json, @NotNull Continuation<? super HTTPResponse> $completion) {
/* 55 */     String serialized = json.string((SerializationStrategy)input, content);
/* 56 */     if (send($this$sendAndWait, url, serialized, options, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return send($this$sendAndWait, url, serialized, options, $completion);  send($this$sendAndWait, url, serialized, options, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\extensions\SuspendableClientExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */