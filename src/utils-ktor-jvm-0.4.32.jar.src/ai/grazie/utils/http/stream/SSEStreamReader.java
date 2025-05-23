/*    */ package ai.grazie.utils.http.stream;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import io.ktor.utils.io.ByteReadChannel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\005\n\002\020\016\n\000\n\002\020\t\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\b\002\030\0002\b\022\004\022\0020\0020\001Bc\022\b\b\002\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004\022$\b\002\020\006\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\b\022\006\022\004\030\0010\t0\007\022\"\020\n\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0130\b\022\006\022\004\030\0010\t0\007¢\006\002\020\fJ\020\020\024\032\0020\0132\006\020\025\032\0020\026H\026J\026\020\027\032\0020\0042\006\020\030\032\0020\002H@¢\006\002\020\031J\026\020\032\032\0020\0132\006\020\030\032\0020\002H@¢\006\002\020\031J\030\020\033\032\004\030\0010\0022\006\020\034\032\0020\035H@¢\006\002\020\036J\b\020\022\032\0020\023H\026J\016\020\005\032\0020\004H@¢\006\002\020\037R/\020\n\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0130\b\022\006\022\004\030\0010\t0\007¢\006\n\n\002\020\017\032\004\b\r\020\016R/\020\006\032\036\b\001\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\b\022\006\022\004\030\0010\t0\007¢\006\n\n\002\020\017\032\004\b\006\020\016R\020\020\020\032\004\030\0010\021X\016¢\006\002\n\000R\016\020\022\032\0020\023X\016¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000¨\006 "}, d2 = {"Lai/grazie/utils/http/stream/SSEStreamReader;", "Lai/grazie/utils/http/stream/StreamReader;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "skipCommentEvent", "", "skipReconnect", "isEnd", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "(ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getBlock", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "lastEventId", "", "reconnectDelay", "", "beforeConnect", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "isLastEvent", "event", "(Lai/grazie/model/cloud/sse/ServerSentEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processEvent", "readEvent", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
/*    */ @SourceDebugExtension({"SMAP\nSSEStreamReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSEStreamReader.kt\nai/grazie/utils/http/stream/SSEStreamReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/*    */ final class SSEStreamReader implements StreamReader<ServerSentEvent> {
/*    */   private final boolean skipCommentEvent;
/*    */   private final boolean skipReconnect;
/*    */   @NotNull
/*    */   private final Function2<ServerSentEvent, Continuation<? super Boolean>, Object> isEnd;
/*    */   @NotNull
/*    */   private final Function2<ServerSentEvent, Continuation<? super Unit>, Object> block;
/*    */   private long reconnectDelay;
/*    */   @Nullable
/*    */   private String lastEventId;
/*    */   
/* 37 */   public SSEStreamReader(boolean skipCommentEvent, boolean skipReconnect, @NotNull Function2<ServerSentEvent, Continuation<? super Boolean>, Object> isEnd, @NotNull Function2<ServerSentEvent, Continuation<? super Unit>, Object> block) { this.skipCommentEvent = skipCommentEvent;
/* 38 */     this.skipReconnect = skipReconnect;
/* 39 */     this.isEnd = isEnd;
/* 40 */     this.block = block;
/*    */ 
/*    */     
/* 43 */     this.reconnectDelay = 3000L; }
/*    */   @NotNull
/*    */   public final Function2<ServerSentEvent, Continuation<? super Boolean>, Object> isEnd() {
/*    */     return this.isEnd;
/* 47 */   } public void beforeConnect(@NotNull HttpRequestBuilder request) { Intrinsics.checkNotNullParameter(request, "request"); String it = this.lastEventId; int $i$a$-let-SSEStreamReader$beforeConnect$1 = 0;
/* 48 */     request.getHeaders().append("Last-Event-ID", it); } @NotNull
/*    */   public final Function2<ServerSentEvent, Continuation<? super Unit>, Object> getBlock() {
/*    */     return this.block;
/*    */   } @Nullable
/*    */   public Object readEvent(@NotNull ByteReadChannel channel, @NotNull Continuation $completion) {
/* 53 */     return SSEStreamReaderKt.access$readEvent(channel, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public Object isLastEvent(@NotNull ServerSentEvent event, @NotNull Continuation $completion) {
/* 57 */     return this.isEnd.invoke(event, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public Object processEvent(@NotNull ServerSentEvent event, @NotNull Continuation $completion) {
/* 61 */     if (event.isEmpty()) {
/* 62 */       MPPLogger.warning$default(SSEStreamReaderKt.access$getLogger$p(), null, new SSEStreamReader$processEvent$2(event), 1, null);
/* 63 */       return Unit.INSTANCE;
/*    */     } 
/* 65 */     if (this.skipCommentEvent && event.isCommentEvent()) {
/* 66 */       SSEStreamReaderKt.access$getLogger$p().info(new SSEStreamReader$processEvent$3(event));
/* 67 */       return Unit.INSTANCE;
/*    */     } 
/*    */     
/* 70 */     if (event.getRetry() != null) {
/* 71 */       Intrinsics.checkNotNull(event.getRetry()); this.reconnectDelay = event.getRetry().longValue();
/* 72 */       if (this.skipReconnect) MPPLogger.warning$default(SSEStreamReaderKt.access$getLogger$p(), null, SSEStreamReader$processEvent$4.INSTANCE, 1, null);
/*    */     
/*    */     } 
/* 75 */     if (event.getId() != null) { Intrinsics.checkNotNull(event.getId()); String str1 = event.getId(), str2 = str1;
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
/*    */ 
/*    */ 
/*    */       
/* 96 */       SSEStreamReader sSEStreamReader = this; int $i$a$-takeIf-SSEStreamReader$processEvent$5 = 0;
/*    */       boolean bool = !StringsKt.isBlank(str2) ? true : false;
/*    */       sSEStreamReader.lastEventId = bool ? str1 : null; }
/*    */     
/*    */     if (this.block.invoke(event, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*    */       return this.block.invoke(event, $completion); 
/*    */     this.block.invoke(event, $completion);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class SSEStreamReader$processEvent$2 extends Lambda implements Function0<String> {
/*    */     SSEStreamReader$processEvent$2(ServerSentEvent $event) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       return "Empty SSE event received: " + this.$event;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class SSEStreamReader$processEvent$3 extends Lambda implements Function0<String> {
/*    */     SSEStreamReader$processEvent$3(ServerSentEvent $event) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       return "Comment SSE event received: " + this.$event.getComment();
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class SSEStreamReader$processEvent$4 extends Lambda implements Function0<String> {
/*    */     public static final SSEStreamReader$processEvent$4 INSTANCE = new SSEStreamReader$processEvent$4();
/*    */     
/*    */     SSEStreamReader$processEvent$4() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       return "Reconnect option is disabled, but retry event received";
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object skipReconnect(@NotNull Continuation $completion) {
/*    */     return Boxing.boxBoolean(this.skipReconnect);
/*    */   }
/*    */   
/*    */   public long reconnectDelay() {
/*    */     return this.reconnectDelay;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\SSEStreamReader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */