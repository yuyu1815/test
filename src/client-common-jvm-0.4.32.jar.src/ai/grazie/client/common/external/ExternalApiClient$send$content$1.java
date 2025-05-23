package ai.grazie.client.common.external;

import ai.grazie.client.common.model.RequestOptions;
import ai.grazie.model.cloud.TypedExternalApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(f = "ExternalApiClient.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$send$content$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003H@"}, d2 = {"<anonymous>", "", "Request", "", "Response"})
final class ExternalApiClient$send$content$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
  int label;
  
  ExternalApiClient$send$content$1(ExternalApiClient $receiver, Object $request, RequestOptions $options, Continuation $completion) {
    super(1, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 162, 0 -> 32, 1 -> 130
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $api : Lai/grazie/model/cloud/TypedExternalApi;
    //   40: invokeinterface getHttpMethod : ()Lai/grazie/model/cloud/HttpMethod;
    //   45: getstatic ai/grazie/model/cloud/HttpMethod.Post : Lai/grazie/model/cloud/HttpMethod;
    //   48: if_acmpne -> 148
    //   51: aload_0
    //   52: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
    //   55: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
    //   58: aload_0
    //   59: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
    //   62: aload_0
    //   63: getfield $api : Lai/grazie/model/cloud/TypedExternalApi;
    //   66: checkcast ai/grazie/model/cloud/ExternalAPI
    //   69: invokevirtual url : (Lai/grazie/model/cloud/ExternalAPI;)Ljava/lang/String;
    //   72: aload_0
    //   73: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
    //   76: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
    //   79: aload_0
    //   80: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
    //   83: aload_0
    //   84: getfield $api : Lai/grazie/model/cloud/TypedExternalApi;
    //   87: invokeinterface getRequestType : ()Lai/grazie/model/cloud/TypeInfo;
    //   92: invokestatic access$getSerializer : (Lai/grazie/client/common/external/ExternalApiClient;Lai/grazie/model/cloud/TypeInfo;)Lkotlinx/serialization/KSerializer;
    //   95: checkcast kotlinx/serialization/SerializationStrategy
    //   98: aload_0
    //   99: getfield $request : Ljava/lang/Object;
    //   102: invokevirtual bytes : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B
    //   105: aload_0
    //   106: getfield $options : Lai/grazie/client/common/model/RequestOptions;
    //   109: aload_0
    //   110: checkcast kotlin/coroutines/Continuation
    //   113: aload_0
    //   114: iconst_1
    //   115: putfield label : I
    //   118: invokeinterface send : (Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   123: dup
    //   124: aload_2
    //   125: if_acmpne -> 135
    //   128: aload_2
    //   129: areturn
    //   130: aload_1
    //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   134: aload_1
    //   135: checkcast ai/grazie/client/common/model/HTTPResponse
    //   138: invokevirtual getContent : ()Ljava/lang/String;
    //   141: dup
    //   142: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   145: goto -> 161
    //   148: new java/lang/IllegalStateException
    //   151: dup
    //   152: ldc 'GET api with body not supported'
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: invokespecial <init> : (Ljava/lang/String;)V
    //   160: athrow
    //   161: areturn
    //   162: new java/lang/IllegalStateException
    //   165: dup
    //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #33	-> 3
    //   #34	-> 36
    //   #35	-> 51
    //   #33	-> 128
    //   #35	-> 135
    //   #37	-> 152
    //   #38	-> 161
    //   #33	-> 162
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	172	0	this	Lai/grazie/client/common/external/ExternalApiClient$send$content$1;
    //   36	126	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Continuation<? super ExternalApiClient$send$content$1> $completion) {
    return (Continuation<Unit>)new ExternalApiClient$send$content$1(ExternalApiClient.this, this.$request, this.$options, $completion);
  }
  
  public final Object invoke(Continuation<?> p1) {
    return ((ExternalApiClient$send$content$1)create(p1)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient$send$content$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */