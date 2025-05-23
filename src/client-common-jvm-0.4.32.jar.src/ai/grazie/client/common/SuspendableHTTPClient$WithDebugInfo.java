/*    */ package ai.grazie.client.common;
/*    */ 
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.client.common.util.DebugHeaders;
/*    */ import ai.grazie.debug.DebugData;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006J\026\020\b\032\0020\t2\006\020\n\032\0020\tH@¢\006\002\020\013R\022\020\004\032\004\030\0010\005X\004¢\006\004\n\002\020\007¨\006\f"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithDebugInfo;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "provideDebugInfo", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class WithDebugInfo
/*    */   extends SuspendableHTTPClient.WithHeaders
/*    */ {
/*    */   @Nullable
/*    */   private final Boolean provideDebugInfo;
/*    */   
/*    */   public WithDebugInfo(@NotNull SuspendableHTTPClient client, @Nullable Boolean provideDebugInfo) {
/* 62 */     super(client, null, 2, null); this.provideDebugInfo = provideDebugInfo; } @Nullable
/*    */   protected Object appendHeaders(@NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 64 */     (DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key); ((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? Boxing.boxBoolean(((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo()) : null; boolean requestDebugInfo = (this.provideDebugInfo != null) ? this.provideDebugInfo.booleanValue() : (((((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? Boxing.boxBoolean(((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo()) : null) != null) ? (((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? Boxing.boxBoolean(((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo()) : null).booleanValue() : false);
/* 65 */     return DebugHeaders.INSTANCE.append(requestDebugInfo, options);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient$WithDebugInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */