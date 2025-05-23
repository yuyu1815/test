package ai.grazie.client.cbor.extensions;

import ai.grazie.client.common.SuspendableHTTPClient;
import ai.grazie.client.common.model.HTTPResponse;
import ai.grazie.client.common.model.RequestOptions;
import ai.grazie.utils.cbor.CBOR;
import ai.grazie.utils.json.JSON;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\0002\n\002\b\002\n\002\020\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\032:\020\000\032\002H\001\"\n\b\000\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHH¢\006\002\020\n\032X\020\013\032\002H\001\"\n\b\000\020\f\030\001*\0020\002\"\n\b\001\020\001\030\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\r\032\002H\f2\b\b\002\020\006\032\0020\0072\b\b\002\020\016\032\0020\0172\b\b\002\020\b\032\0020\tHH¢\006\002\020\020\032p\020\013\032\002H\001\"\b\b\000\020\f*\0020\002\"\b\b\001\020\001*\0020\002*\0020\0032\006\020\004\032\0020\0052\006\020\r\032\002H\f2\f\020\021\032\b\022\004\022\002H\f0\0222\f\020\023\032\b\022\004\022\002H\0010\0222\b\b\002\020\006\032\0020\0072\b\b\002\020\016\032\0020\0172\b\b\002\020\b\032\0020\tH@¢\006\002\020\024\032F\020\013\032\002H\001\"\b\b\000\020\001*\0020\002*\0020\0032\006\020\025\032\0020\0052\f\020\023\032\b\022\004\022\002H\0010\0222\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH@¢\006\002\020\026¨\006\027"}, d2 = {"get", "O", "", "Lai/grazie/client/common/SuspendableHTTPClient;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "cbor", "Lai/grazie/utils/cbor/CBOR;", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndGet", "I", "content", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "input", "Lkotlinx/serialization/KSerializer;", "output", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-cbor"})
public final class SuspendableClientExtensionsKt {
  @Nullable
  public static final <I, O> Object sendAndGet(@NotNull SuspendableHTTPClient $this$sendAndGet, @NotNull String url, @NotNull Object content, @NotNull KSerializer input, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull JSON json, @NotNull CBOR cbor, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload #8
    //   2: instanceof ai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt$sendAndGet$1
    //   5: ifeq -> 41
    //   8: aload #8
    //   10: checkcast ai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt$sendAndGet$1
    //   13: astore #12
    //   15: aload #12
    //   17: getfield label : I
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #12
    //   28: dup
    //   29: getfield label : I
    //   32: ldc -2147483648
    //   34: isub
    //   35: putfield label : I
    //   38: goto -> 52
    //   41: new ai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt$sendAndGet$1
    //   44: dup
    //   45: aload #8
    //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   50: astore #12
    //   52: aload #12
    //   54: getfield result : Ljava/lang/Object;
    //   57: astore #11
    //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   62: astore #13
    //   64: aload #12
    //   66: getfield label : I
    //   69: tableswitch default -> 201, 0 -> 92, 1 -> 149
    //   92: aload #11
    //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   97: aload #6
    //   99: aload_3
    //   100: checkcast kotlinx/serialization/SerializationStrategy
    //   103: aload_2
    //   104: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
    //   107: astore #9
    //   109: aload_0
    //   110: aload_1
    //   111: aload #9
    //   113: aload #5
    //   115: aload #12
    //   117: aload #12
    //   119: aload #4
    //   121: putfield L$0 : Ljava/lang/Object;
    //   124: aload #12
    //   126: aload #7
    //   128: putfield L$1 : Ljava/lang/Object;
    //   131: aload #12
    //   133: iconst_1
    //   134: putfield label : I
    //   137: invokestatic send : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   140: dup
    //   141: aload #13
    //   143: if_acmpne -> 176
    //   146: aload #13
    //   148: areturn
    //   149: aload #12
    //   151: getfield L$1 : Ljava/lang/Object;
    //   154: checkcast ai/grazie/utils/cbor/CBOR
    //   157: astore #7
    //   159: aload #12
    //   161: getfield L$0 : Ljava/lang/Object;
    //   164: checkcast kotlinx/serialization/KSerializer
    //   167: astore #4
    //   169: aload #11
    //   171: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   174: aload #11
    //   176: checkcast ai/grazie/client/common/model/HTTPResponse
    //   179: astore #10
    //   181: aload #7
    //   183: aload #4
    //   185: checkcast kotlinx/serialization/DeserializationStrategy
    //   188: aload #10
    //   190: invokevirtual getBytes : ()[B
    //   193: dup
    //   194: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   197: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;
    //   200: areturn
    //   201: new java/lang/IllegalStateException
    //   204: dup
    //   205: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   207: invokespecial <init> : (Ljava/lang/String;)V
    //   210: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 62
    //   #21	-> 97
    //   #22	-> 109
    //   #12	-> 146
    //   #23	-> 181
    //   #12	-> 201
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   97	43	0	$this$sendAndGet	Lai/grazie/client/common/SuspendableHTTPClient;
    //   97	43	1	url	Ljava/lang/String;
    //   97	12	2	content	Ljava/lang/Object;
    //   97	12	3	input	Lkotlinx/serialization/KSerializer;
    //   97	52	4	output	Lkotlinx/serialization/KSerializer;
    //   169	32	4	output	Lkotlinx/serialization/KSerializer;
    //   97	43	5	options	Lai/grazie/client/common/model/RequestOptions;
    //   97	12	6	json	Lai/grazie/utils/json/JSON;
    //   97	52	7	cbor	Lai/grazie/utils/cbor/CBOR;
    //   159	42	7	cbor	Lai/grazie/utils/cbor/CBOR;
    //   109	31	9	serialized	Ljava/lang/String;
    //   181	20	10	response	Lai/grazie/client/common/model/HTTPResponse;
    //   0	211	8	$completion	Lkotlin/coroutines/Continuation;
    //   52	149	12	$continuation	Lkotlin/coroutines/Continuation;
    //   59	142	11	$result	Ljava/lang/Object;
  }
  
  @Nullable
  public static final <O> Object sendAndGet(@NotNull SuspendableHTTPClient $this$sendAndGet, @NotNull String api, @NotNull KSerializer output, @NotNull RequestOptions options, @NotNull CBOR cbor, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload #5
    //   2: instanceof ai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt$sendAndGet$3
    //   5: ifeq -> 41
    //   8: aload #5
    //   10: checkcast ai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt$sendAndGet$3
    //   13: astore #8
    //   15: aload #8
    //   17: getfield label : I
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #8
    //   28: dup
    //   29: getfield label : I
    //   32: ldc -2147483648
    //   34: isub
    //   35: putfield label : I
    //   38: goto -> 52
    //   41: new ai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt$sendAndGet$3
    //   44: dup
    //   45: aload #5
    //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
    //   50: astore #8
    //   52: aload #8
    //   54: getfield result : Ljava/lang/Object;
    //   57: astore #7
    //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   62: astore #9
    //   64: aload #8
    //   66: getfield label : I
    //   69: tableswitch default -> 185, 0 -> 92, 1 -> 135
    //   92: aload #7
    //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   97: aload_0
    //   98: aload_1
    //   99: aload_3
    //   100: aload #8
    //   102: aload #8
    //   104: aload_2
    //   105: putfield L$0 : Ljava/lang/Object;
    //   108: aload #8
    //   110: aload #4
    //   112: putfield L$1 : Ljava/lang/Object;
    //   115: aload #8
    //   117: iconst_1
    //   118: putfield label : I
    //   121: invokeinterface send : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   126: dup
    //   127: aload #9
    //   129: if_acmpne -> 161
    //   132: aload #9
    //   134: areturn
    //   135: aload #8
    //   137: getfield L$1 : Ljava/lang/Object;
    //   140: checkcast ai/grazie/utils/cbor/CBOR
    //   143: astore #4
    //   145: aload #8
    //   147: getfield L$0 : Ljava/lang/Object;
    //   150: checkcast kotlinx/serialization/KSerializer
    //   153: astore_2
    //   154: aload #7
    //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   159: aload #7
    //   161: checkcast ai/grazie/client/common/model/HTTPResponse
    //   164: astore #6
    //   166: aload #4
    //   168: aload_2
    //   169: checkcast kotlinx/serialization/DeserializationStrategy
    //   172: aload #6
    //   174: invokevirtual getBytes : ()[B
    //   177: dup
    //   178: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   181: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;
    //   184: areturn
    //   185: new java/lang/IllegalStateException
    //   188: dup
    //   189: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   191: invokespecial <init> : (Ljava/lang/String;)V
    //   194: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #36	-> 62
    //   #42	-> 97
    //   #36	-> 132
    //   #43	-> 166
    //   #36	-> 185
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   97	29	0	$this$sendAndGet	Lai/grazie/client/common/SuspendableHTTPClient;
    //   97	29	1	api	Ljava/lang/String;
    //   97	38	2	output	Lkotlinx/serialization/KSerializer;
    //   154	31	2	output	Lkotlinx/serialization/KSerializer;
    //   97	29	3	options	Lai/grazie/client/common/model/RequestOptions;
    //   97	38	4	cbor	Lai/grazie/utils/cbor/CBOR;
    //   145	40	4	cbor	Lai/grazie/utils/cbor/CBOR;
    //   166	19	6	response	Lai/grazie/client/common/model/HTTPResponse;
    //   0	195	5	$completion	Lkotlin/coroutines/Continuation;
    //   52	133	8	$continuation	Lkotlin/coroutines/Continuation;
    //   59	126	7	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "SuspendableClientExtensions.kt", l = {22}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "cbor"}, m = "sendAndGet", c = "ai.grazie.client.cbor.extensions.SuspendableClientExtensionsKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableClientExtensionsKt$sendAndGet$1<I, O> extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    int label;
    
    SuspendableClientExtensionsKt$sendAndGet$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableClientExtensionsKt.sendAndGet(null, null, null, null, null, null, null, null, (Continuation)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableClientExtensions.kt", l = {42}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "cbor"}, m = "sendAndGet", c = "ai.grazie.client.cbor.extensions.SuspendableClientExtensionsKt")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableClientExtensionsKt$sendAndGet$3<O> extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    int label;
    
    SuspendableClientExtensionsKt$sendAndGet$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableClientExtensionsKt.sendAndGet(null, null, null, null, null, (Continuation)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-cbor-jvm-0.4.32.jar!\ai\grazie\client\cbor\extensions\SuspendableClientExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */