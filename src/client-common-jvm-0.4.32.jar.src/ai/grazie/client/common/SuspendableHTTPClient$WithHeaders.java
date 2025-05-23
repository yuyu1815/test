/*    */ package ai.grazie.client.common;
/*    */ 
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.Multipart;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\b&\030\0002\0020\001B\027\b\027\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005B\027\022\006\020\002\032\0020\001\022\b\b\002\020\003\032\0020\006¢\006\002\020\007J\026\020\n\032\0020\0132\006\020\f\032\0020\013H@¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\f\032\0020\013H@¢\006\002\020\022J4\020\023\032\b\022\004\022\0020\0250\0242\006\020\020\032\0020\0212\006\020\026\032\0020\0212\006\020\f\032\0020\0132\006\020\027\032\0020\030H@¢\006\002\020\031J@\020\032\032\b\022\004\022\0020\0210\0242\006\020\020\032\0020\0212\006\020\026\032\0020\0212\006\020\f\032\0020\0132\022\020\033\032\016\022\004\022\0020\021\022\004\022\0020\0300\034H@¢\006\002\020\035J&\020\036\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020\0372\006\020\f\032\0020\013H@¢\006\002\020 J\036\020\036\032\0020\0172\006\020\020\032\0020\0212\006\020\f\032\0020\013H@¢\006\002\020\022J&\020\036\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020!2\006\020\f\032\0020\013H@¢\006\002\020\"R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\006¢\006\b\n\000\032\004\b\b\020\t¨\006#"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/model/HeaderCollection;)V", "Lai/grazie/model/cloud/HeaderCollection;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/cloud/HeaderCollection;)V", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveLineStream", "isLastLine", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendableHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableHTTPClient.kt\nai/grazie/client/common/SuspendableHTTPClient$WithHeaders\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
/*    */ public abstract class WithHeaders implements SuspendableHTTPClient {
/*    */   @NotNull
/*    */   private final SuspendableHTTPClient client;
/*    */   
/* 21 */   public WithHeaders(@NotNull SuspendableHTTPClient client, @NotNull HeaderCollection headers) { this.client = client;
/* 22 */     this.headers = headers; } @NotNull private final HeaderCollection headers; @NotNull public final HeaderCollection getHeaders() { return this.headers; }
/*    */    @Deprecated(message = "In favor of overload with new HeaderCollection")
/*    */   public WithHeaders(@NotNull SuspendableHTTPClient client, @NotNull HeaderCollection headers) {
/* 25 */     this(client, headers.toHeaderCollection());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected Object appendHeaders(@NotNull RequestOptions options, @NotNull Continuation<? super RequestOptions> $completion) {
/*    */     return appendHeaders$suspendImpl(this, options, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*    */     return send$suspendImpl(this, url, content, options, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*    */     return send$suspendImpl(this, url, content, options, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation<? super Flow<ServerSentEvent>> $completion) {
/*    */     return receiveContinuousSSE$suspendImpl(this, url, content, options, reconnect, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object receiveLineStream(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, @NotNull Function1<? super String, Boolean> isLastLine, @NotNull Continuation<? super Flow<String>> $completion) {
/*    */     return receiveLineStream$suspendImpl(this, url, content, options, isLastLine, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*    */     return send$suspendImpl(this, url, options, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*    */     return get$suspendImpl(this, url, options, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {50, 50}, i = {}, s = {}, n = {}, m = "get$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableHTTPClient$WithHeaders$get$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     SuspendableHTTPClient$WithHeaders$get$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableHTTPClient.WithHeaders.get$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, (Continuation<? super HTTPResponse>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {38, 38}, i = {0}, s = {"Z$0"}, n = {"reconnect"}, m = "receiveContinuousSSE$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1 extends ContinuationImpl {
/*    */     boolean Z$0;
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableHTTPClient.WithHeaders.receiveContinuousSSE$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {42, 42}, i = {0}, s = {"L$0"}, n = {"isLastLine"}, m = "receiveLineStream$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableHTTPClient$WithHeaders$receiveLineStream$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     int label;
/*    */     
/*    */     SuspendableHTTPClient$WithHeaders$receiveLineStream$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableHTTPClient.WithHeaders.receiveLineStream$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, null, null, (Continuation<? super Flow<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {30, 30}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableHTTPClient$WithHeaders$send$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SuspendableHTTPClient$WithHeaders$send$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, (String)null, (byte[])null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {34, 34}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableHTTPClient$WithHeaders$send$2 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SuspendableHTTPClient$WithHeaders$send$2(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, (String)null, (Multipart)null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {46, 46}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendableHTTPClient$WithHeaders$send$3 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     SuspendableHTTPClient$WithHeaders$send$3(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, (Continuation<? super HTTPResponse>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient$WithHeaders.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */