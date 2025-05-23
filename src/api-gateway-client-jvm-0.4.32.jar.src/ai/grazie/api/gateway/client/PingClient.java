/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.cloud.SuspendableCloudClient;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\007\032\0020\bH@¢\006\002\020\t¨\006\n"}, d2 = {"Lai/grazie/api/gateway/client/PingClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "url", "", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "(Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;)V", "ping", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ final class PingClient
/*    */   extends SuspendableCloudClient
/*    */ {
/*    */   public PingClient(@NotNull String url, @NotNull SuspendableHTTPClient httpClient) {
/* 49 */     super(url, null, httpClient, null, new ai.grazie.model.cloud.AuthVersion[0], 8, null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object ping(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/PingClient$ping$1
/*    */     //   4: ifeq -> 36
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/PingClient$ping$1
/*    */     //   11: astore_3
/*    */     //   12: aload_3
/*    */     //   13: getfield label : I
/*    */     //   16: ldc -2147483648
/*    */     //   18: iand
/*    */     //   19: ifeq -> 36
/*    */     //   22: aload_3
/*    */     //   23: dup
/*    */     //   24: getfield label : I
/*    */     //   27: ldc -2147483648
/*    */     //   29: isub
/*    */     //   30: putfield label : I
/*    */     //   33: goto -> 46
/*    */     //   36: new ai/grazie/api/gateway/client/PingClient$ping$1
/*    */     //   39: dup
/*    */     //   40: aload_0
/*    */     //   41: aload_1
/*    */     //   42: invokespecial <init> : (Lai/grazie/api/gateway/client/PingClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   45: astore_3
/*    */     //   46: aload_3
/*    */     //   47: getfield result : Ljava/lang/Object;
/*    */     //   50: astore_2
/*    */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   54: astore #4
/*    */     //   56: aload_3
/*    */     //   57: getfield label : I
/*    */     //   60: tableswitch default -> 168, 0 -> 84, 1 -> 119
/*    */     //   84: aload_2
/*    */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   88: aload_0
/*    */     //   89: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   92: getstatic ai/grazie/api/gateway/api/PingApi$Ping.INSTANCE : Lai/grazie/api/gateway/api/PingApi$Ping;
/*    */     //   95: checkcast ai/grazie/model/cloud/API
/*    */     //   98: aconst_null
/*    */     //   99: aload_3
/*    */     //   100: iconst_2
/*    */     //   101: aconst_null
/*    */     //   102: aload_3
/*    */     //   103: iconst_1
/*    */     //   104: putfield label : I
/*    */     //   107: invokestatic get$default : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   110: dup
/*    */     //   111: aload #4
/*    */     //   113: if_acmpne -> 124
/*    */     //   116: aload #4
/*    */     //   118: areturn
/*    */     //   119: aload_2
/*    */     //   120: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   123: aload_2
/*    */     //   124: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   127: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   130: dup
/*    */     //   131: ifnull -> 162
/*    */     //   134: checkcast java/lang/CharSequence
/*    */     //   137: invokeinterface length : ()I
/*    */     //   142: ifle -> 149
/*    */     //   145: iconst_1
/*    */     //   146: goto -> 150
/*    */     //   149: iconst_0
/*    */     //   150: iconst_1
/*    */     //   151: if_icmpne -> 158
/*    */     //   154: iconst_1
/*    */     //   155: goto -> 164
/*    */     //   158: iconst_0
/*    */     //   159: goto -> 164
/*    */     //   162: pop
/*    */     //   163: iconst_0
/*    */     //   164: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   167: areturn
/*    */     //   168: new java/lang/IllegalStateException
/*    */     //   171: dup
/*    */     //   172: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   174: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   177: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 54
/*    */     //   #50	-> 88
/*    */     //   #50	-> 116
/*    */     //   #50	-> 124
/*    */     //   #50	-> 150
/*    */     //   #50	-> 168
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   88	22	0	this	Lai/grazie/api/gateway/client/PingClient;
/*    */     //   0	178	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   46	122	3	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   51	117	2	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "UrlResolver.kt", l = {50}, i = {}, s = {}, n = {}, m = "ping", c = "ai.grazie.api.gateway.client.PingClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class PingClient$ping$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     PingClient$ping$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PingClient.this.ping((Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\PingClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */