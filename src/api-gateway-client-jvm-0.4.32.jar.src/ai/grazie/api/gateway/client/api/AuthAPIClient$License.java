package ai.grazie.api.gateway.client.api;

import ai.grazie.license.JBALicense;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\004\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\004\030\0010\0042\006\020\005\032\0020\006H@¢\006\002\020\007¨\006\b"}, d2 = {"Lai/grazie/api/gateway/client/api/AuthAPIClient$License;", "", "(Lai/grazie/api/gateway/client/api/AuthAPIClient;)V", "obtainGrazieLite", "Lai/grazie/license/JBALicense;", "jwtToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
@SourceDebugExtension({"SMAP\nAuthAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient$License\n+ 2 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,176:1\n7#2,2:177\n*S KotlinDebug\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient$License\n*L\n119#1:177,2\n*E\n"})
public final class License {
  @Nullable
  public final Object obtainGrazieLite(@NotNull String jwtToken, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$License$obtainGrazieLite$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$License$obtainGrazieLite$1
    //   11: astore #9
    //   13: aload #9
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #9
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$License$obtainGrazieLite$1
    //   42: dup
    //   43: aload_0
    //   44: aload_2
    //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient$License;Lkotlin/coroutines/Continuation;)V
    //   48: astore #9
    //   50: aload #9
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #8
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #10
    //   62: aload #9
    //   64: getfield label : I
    //   67: tableswitch default -> 221, 0 -> 88, 1 -> 161
    //   88: aload #8
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: aload_0
    //   94: getfield this$0 : Lai/grazie/api/gateway/client/api/AuthAPIClient;
    //   97: invokestatic access$getBaseClient$p : (Lai/grazie/api/gateway/client/api/AuthAPIClient;)Lai/grazie/client/common/SuspendableHTTPClient;
    //   100: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite;
    //   103: checkcast ai/grazie/model/cloud/API
    //   106: aload_0
    //   107: getfield this$0 : Lai/grazie/api/gateway/client/api/AuthAPIClient;
    //   110: invokevirtual getServerUrl : ()Ljava/lang/String;
    //   113: aconst_null
    //   114: aconst_null
    //   115: bipush #6
    //   117: aconst_null
    //   118: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
    //   121: new ai/grazie/client/common/model/RequestOptions
    //   124: dup
    //   125: aload_0
    //   126: getfield this$0 : Lai/grazie/api/gateway/client/api/AuthAPIClient;
    //   129: aload_1
    //   130: invokestatic access$buildAuthHeader : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Ljava/lang/String;)Lai/grazie/model/cloud/HeaderCollection;
    //   133: aconst_null
    //   134: aconst_null
    //   135: bipush #6
    //   137: aconst_null
    //   138: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   141: aload #9
    //   143: aload #9
    //   145: iconst_1
    //   146: putfield label : I
    //   149: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   152: dup
    //   153: aload #10
    //   155: if_acmpne -> 168
    //   158: aload #10
    //   160: areturn
    //   161: aload #8
    //   163: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   166: aload #8
    //   168: checkcast ai/grazie/client/common/model/HTTPResponse
    //   171: astore #4
    //   173: nop
    //   174: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response$Companion;
    //   177: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   180: astore #5
    //   182: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   185: checkcast ai/grazie/utils/json/JSON
    //   188: astore #6
    //   190: iconst_0
    //   191: istore #7
    //   193: aload #6
    //   195: aload #5
    //   197: checkcast kotlinx/serialization/DeserializationStrategy
    //   200: aload #4
    //   202: invokevirtual getContent : ()Ljava/lang/String;
    //   205: dup
    //   206: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   209: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   212: checkcast ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response
    //   215: astore_3
    //   216: aload_3
    //   217: invokevirtual getLicense : ()Lai/grazie/license/JBALicense;
    //   220: areturn
    //   221: new java/lang/IllegalStateException
    //   224: dup
    //   225: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   227: invokespecial <init> : (Ljava/lang/String;)V
    //   230: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #115	-> 60
    //   #116	-> 93
    //   #117	-> 100
    //   #118	-> 121
    //   #116	-> 143
    //   #115	-> 158
    //   #119	-> 173
    //   #177	-> 174
    //   #178	-> 193
    //   #119	-> 212
    //   #116	-> 215
    //   #121	-> 216
    //   #115	-> 221
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	50	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient$License;
    //   93	50	1	jwtToken	Ljava/lang/String;
    //   216	5	3	response	Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;
    //   173	39	4	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
    //   182	30	5	serializer$iv	Lkotlinx/serialization/KSerializer;
    //   190	22	6	json$iv	Lai/grazie/utils/json/JSON;
    //   193	19	7	$i$f$get	I
    //   0	231	2	$completion	Lkotlin/coroutines/Continuation;
    //   50	171	9	$continuation	Lkotlin/coroutines/Continuation;
    //   57	164	8	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "AuthAPIClient.kt", l = {116}, i = {}, s = {}, n = {}, m = "obtainGrazieLite", c = "ai.grazie.api.gateway.client.api.AuthAPIClient$License")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class AuthAPIClient$License$obtainGrazieLite$1 extends ContinuationImpl {
    int label;
    
    AuthAPIClient$License$obtainGrazieLite$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return AuthAPIClient.License.this.obtainGrazieLite(null, (Continuation<? super JBALicense>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\AuthAPIClient$License.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */