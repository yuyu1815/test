/*    */ package ai.grazie.utils.http.stream;
/*    */ 
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import io.ktor.utils.io.ByteReadChannel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\003\bf\030\000*\004\b\000\020\0012\0020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H&J\026\020\007\032\0020\b2\006\020\t\032\0028\000H¦@¢\006\002\020\nJ\026\020\013\032\0020\0042\006\020\t\032\0028\000H¦@¢\006\002\020\nJ\030\020\f\032\004\030\0018\0002\006\020\r\032\0020\016H¦@¢\006\002\020\017J\b\020\020\032\0020\021H\026J\016\020\022\032\0020\bH¦@¢\006\002\020\023ø\001\000\002\006\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Lai/grazie/utils/http/stream/StreamReader;", "T", "", "beforeConnect", "", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "isLastEvent", "", "event", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processEvent", "readEvent", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reconnectDelay", "", "skipReconnect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
/*    */ public interface StreamReader<T>
/*    */ {
/*    */   void beforeConnect(@NotNull HttpRequestBuilder paramHttpRequestBuilder);
/*    */   
/*    */   @Nullable
/*    */   Object readEvent(@NotNull ByteReadChannel paramByteReadChannel, @NotNull Continuation<? super T> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object isLastEvent(T paramT, @NotNull Continuation<? super Boolean> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object processEvent(T paramT, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object skipReconnect(@NotNull Continuation<? super Boolean> paramContinuation);
/*    */   
/*    */   default long reconnectDelay() {
/* 39 */     return 0L;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\StreamReader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */