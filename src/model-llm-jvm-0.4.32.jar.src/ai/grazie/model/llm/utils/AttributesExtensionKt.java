package ai.grazie.model.llm.utils;

import ai.grazie.model.cloud.exceptions.ExtensionsKt;
import ai.grazie.model.llm.chat.caching.LLMCachePoints;
import ai.grazie.model.llm.chat.function.LLMFunction;
import ai.grazie.model.llm.chat.function.LLMFunctionCall;
import ai.grazie.model.llm.chat.response.LLMResponseFormat;
import ai.grazie.utils.attributes.Attributes;
import ai.grazie.utils.json.JSON;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\t\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\006\n\002\b\004\032\f\020\000\032\004\030\0010\001*\0020\002\032\f\020\003\032\004\030\0010\004*\0020\002\032\022\020\005\032\n\022\004\022\0020\007\030\0010\006*\0020\002\032\021\020\b\032\004\030\0010\t*\0020\002¢\006\002\020\n\032\021\020\013\032\004\030\0010\t*\0020\002¢\006\002\020\n\032$\020\f\032\004\030\001H\r\"\006\b\000\020\r\030\001*\0020\0022\006\020\016\032\0020\017H\b¢\006\002\020\020\032\f\020\021\032\004\030\0010\022*\0020\002\032\f\020\023\032\004\030\0010\022*\0020\002\032\f\020\024\032\004\030\0010\025*\0020\002\032\021\020\026\032\004\030\0010\t*\0020\002¢\006\002\020\n\032\f\020\027\032\004\030\0010\022*\0020\002\032\021\020\030\032\004\030\0010\031*\0020\002¢\006\002\020\032\032\021\020\033\032\004\030\0010\t*\0020\002¢\006\002\020\n\032\021\020\034\032\004\030\0010\031*\0020\002¢\006\002\020\032¨\006\035"}, d2 = {"getCachePoints", "Lai/grazie/model/llm/chat/caching/LLMCachePoints;", "Lai/grazie/utils/attributes/Attributes;", "getFunctionCall", "Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "getFunctions", "", "Lai/grazie/model/llm/chat/function/LLMFunction;", "getLength", "", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Long;", "getNumberOfChoices", "getParameter", "T", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "(Lai/grazie/utils/attributes/Attributes;Lai/grazie/utils/attributes/Attributes$Key;)Ljava/lang/Object;", "getPredictedOutput", "", "getReasoningEffort", "getResponseFormat", "Lai/grazie/model/llm/chat/response/LLMResponseFormat;", "getSeed", "getStopToken", "getTemperature", "", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Double;", "getTopK", "getTopP", "model-llm"})
@SourceDebugExtension({"SMAP\nAttributesExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributesExtension.kt\nai/grazie/model/llm/utils/AttributesExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n15#1,7:51\n14#1,6:58\n15#1,7:65\n14#1,6:72\n15#1,7:79\n14#1,6:86\n15#1,7:93\n14#1,6:100\n15#1,7:107\n14#1,6:114\n15#1,7:121\n14#1,6:128\n15#1,7:135\n14#1,6:142\n15#1,7:149\n14#1,6:156\n15#1,7:163\n14#1,6:170\n15#1,7:177\n14#1,6:184\n15#1,7:191\n14#1,6:198\n15#1,7:205\n14#1,6:212\n15#1,7:219\n14#1,6:226\n1#2:50\n1#2:64\n1#2:78\n1#2:92\n1#2:106\n1#2:120\n1#2:134\n1#2:148\n1#2:162\n1#2:176\n1#2:190\n1#2:204\n1#2:218\n1#2:232\n*S KotlinDebug\n*F\n+ 1 AttributesExtension.kt\nai/grazie/model/llm/utils/AttributesExtensionKt\n*L\n24#1:51,7\n24#1:58,6\n26#1:65,7\n26#1:72,6\n28#1:79,7\n28#1:86,6\n30#1:93,7\n30#1:100,6\n32#1:107,7\n32#1:114,6\n34#1:121,7\n34#1:128,6\n36#1:135,7\n36#1:142,6\n38#1:149,7\n38#1:156,6\n40#1:163,7\n40#1:170,6\n42#1:177,7\n42#1:184,6\n44#1:191,7\n44#1:198,6\n46#1:205,7\n46#1:212,6\n48#1:219,7\n48#1:226,6\n24#1:64\n26#1:78\n28#1:92\n30#1:106\n32#1:120\n34#1:134\n36#1:148\n38#1:162\n40#1:176\n42#1:190\n44#1:204\n46#1:218\n48#1:232\n*E\n"})
public final class AttributesExtensionKt {
  @Nullable
  public static final Double getTemperature(@NotNull Attributes $this$getTemperature) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getTemperature : ()Lai/grazie/utils/attributes/Attributes$Key$Double;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/DoubleSerializer.INSTANCE : Lkotlinx/serialization/internal/DoubleSerializer;
    //   53: invokestatic getNullable : (Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof java/lang/Double
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast java/lang/Double
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #24	-> 6
    //   #51	-> 20
    //   #57	-> 20
    //   #58	-> 20
    //   #51	-> 27
    //   #58	-> 32
    //   #51	-> 34
    //   #60	-> 39
    //   #61	-> 41
    //   #62	-> 96
    //   #63	-> 101
    //   #51	-> 102
    //   #51	-> 103
    //   #57	-> 105
    //   #51	-> 110
    //   #57	-> 112
    //   #64	-> 114
    //   #57	-> 117
    //   #57	-> 153
    //   #51	-> 156
    //   #58	-> 157
    //   #24	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getTemperature	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final Long getSeed(@NotNull Attributes $this$getSeed) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getSeed : ()Lai/grazie/utils/attributes/Attributes$Key$Long;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/LongSerializer.INSTANCE : Lkotlinx/serialization/internal/LongSerializer;
    //   53: invokestatic getNullable : (Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof java/lang/Long
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast java/lang/Long
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 6
    //   #65	-> 20
    //   #71	-> 20
    //   #72	-> 20
    //   #65	-> 27
    //   #72	-> 32
    //   #65	-> 34
    //   #74	-> 39
    //   #75	-> 41
    //   #76	-> 96
    //   #77	-> 101
    //   #65	-> 102
    //   #65	-> 103
    //   #71	-> 105
    //   #65	-> 110
    //   #71	-> 112
    //   #78	-> 114
    //   #71	-> 117
    //   #71	-> 153
    //   #65	-> 156
    //   #72	-> 157
    //   #26	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getSeed	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final Double getTopP(@NotNull Attributes $this$getTopP) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getTopP : ()Lai/grazie/utils/attributes/Attributes$Key$Double;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/DoubleSerializer.INSTANCE : Lkotlinx/serialization/internal/DoubleSerializer;
    //   53: invokestatic getNullable : (Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof java/lang/Double
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast java/lang/Double
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #28	-> 6
    //   #79	-> 20
    //   #85	-> 20
    //   #86	-> 20
    //   #79	-> 27
    //   #86	-> 32
    //   #79	-> 34
    //   #88	-> 39
    //   #89	-> 41
    //   #90	-> 96
    //   #91	-> 101
    //   #79	-> 102
    //   #79	-> 103
    //   #85	-> 105
    //   #79	-> 110
    //   #85	-> 112
    //   #92	-> 114
    //   #85	-> 117
    //   #85	-> 153
    //   #79	-> 156
    //   #86	-> 157
    //   #28	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getTopP	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final Long getTopK(@NotNull Attributes $this$getTopK) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getTopK : ()Lai/grazie/utils/attributes/Attributes$Key$Long;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/LongSerializer.INSTANCE : Lkotlinx/serialization/internal/LongSerializer;
    //   53: invokestatic getNullable : (Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof java/lang/Long
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast java/lang/Long
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #30	-> 6
    //   #93	-> 20
    //   #99	-> 20
    //   #100	-> 20
    //   #93	-> 27
    //   #100	-> 32
    //   #93	-> 34
    //   #102	-> 39
    //   #103	-> 41
    //   #104	-> 96
    //   #105	-> 101
    //   #93	-> 102
    //   #93	-> 103
    //   #99	-> 105
    //   #93	-> 110
    //   #99	-> 112
    //   #106	-> 114
    //   #99	-> 117
    //   #99	-> 153
    //   #93	-> 156
    //   #100	-> 157
    //   #30	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getTopK	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final LLMResponseFormat getResponseFormat(@NotNull Attributes $this$getResponseFormat) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getResponseFormat : ()Lai/grazie/utils/attributes/Attributes$Key$Json;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic ai/grazie/model/llm/chat/response/LLMResponseFormat.Companion : Lai/grazie/model/llm/chat/response/LLMResponseFormat$Companion;
    //   53: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof ai/grazie/model/llm/chat/response/LLMResponseFormat
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast ai/grazie/model/llm/chat/response/LLMResponseFormat
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #32	-> 6
    //   #107	-> 20
    //   #113	-> 20
    //   #114	-> 20
    //   #107	-> 27
    //   #114	-> 32
    //   #107	-> 34
    //   #116	-> 39
    //   #117	-> 41
    //   #118	-> 96
    //   #119	-> 101
    //   #107	-> 102
    //   #107	-> 103
    //   #113	-> 105
    //   #107	-> 110
    //   #113	-> 112
    //   #120	-> 114
    //   #113	-> 117
    //   #113	-> 153
    //   #107	-> 156
    //   #114	-> 157
    //   #32	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getResponseFormat	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final Long getLength(@NotNull Attributes $this$getLength) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getLength : ()Lai/grazie/utils/attributes/Attributes$Key$Long;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 153
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 93
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/LongSerializer.INSTANCE : Lkotlinx/serialization/internal/LongSerializer;
    //   53: checkcast kotlinx/serialization/DeserializationStrategy
    //   56: aload #5
    //   58: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   61: invokevirtual getValue : ()Ljava/lang/String;
    //   64: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   67: dup
    //   68: ifnonnull -> 98
    //   71: pop
    //   72: aload_2
    //   73: invokevirtual getFqdn : ()Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   81: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   84: pop
    //   85: new kotlin/KotlinNothingValueException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: athrow
    //   93: aload #5
    //   95: invokevirtual getValue : ()Ljava/lang/Object;
    //   98: nop
    //   99: nop
    //   100: astore #7
    //   102: aload #7
    //   104: ifnull -> 153
    //   107: aload #7
    //   109: astore #5
    //   111: iconst_0
    //   112: istore #6
    //   114: aload #5
    //   116: dup
    //   117: instanceof java/lang/Long
    //   120: ifne -> 125
    //   123: pop
    //   124: aconst_null
    //   125: checkcast java/lang/Long
    //   128: dup
    //   129: ifnonnull -> 150
    //   132: pop
    //   133: new java/lang/IllegalStateException
    //   136: dup
    //   137: aload_2
    //   138: invokevirtual getFqdn : ()Ljava/lang/String;
    //   141: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: athrow
    //   150: goto -> 154
    //   153: aconst_null
    //   154: nop
    //   155: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #34	-> 6
    //   #121	-> 20
    //   #127	-> 20
    //   #128	-> 20
    //   #121	-> 27
    //   #128	-> 32
    //   #121	-> 34
    //   #130	-> 39
    //   #131	-> 41
    //   #132	-> 93
    //   #133	-> 98
    //   #121	-> 99
    //   #121	-> 100
    //   #127	-> 102
    //   #121	-> 107
    //   #127	-> 109
    //   #134	-> 111
    //   #127	-> 114
    //   #127	-> 150
    //   #121	-> 153
    //   #128	-> 154
    //   #34	-> 155
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	60	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	63	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   114	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   111	39	5	it$iv	Ljava/lang/Object;
    //   20	135	3	$i$f$getParameter	I
    //   18	137	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	137	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	156	0	$this$getLength	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final String getPredictedOutput(@NotNull Attributes $this$getPredictedOutput) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getPredictedOutput : ()Lai/grazie/utils/attributes/Attributes$Key$Text;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 153
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 93
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE : Lkotlinx/serialization/internal/StringSerializer;
    //   53: checkcast kotlinx/serialization/DeserializationStrategy
    //   56: aload #5
    //   58: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   61: invokevirtual getValue : ()Ljava/lang/String;
    //   64: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   67: dup
    //   68: ifnonnull -> 98
    //   71: pop
    //   72: aload_2
    //   73: invokevirtual getFqdn : ()Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   81: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   84: pop
    //   85: new kotlin/KotlinNothingValueException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: athrow
    //   93: aload #5
    //   95: invokevirtual getValue : ()Ljava/lang/Object;
    //   98: nop
    //   99: nop
    //   100: astore #7
    //   102: aload #7
    //   104: ifnull -> 153
    //   107: aload #7
    //   109: astore #5
    //   111: iconst_0
    //   112: istore #6
    //   114: aload #5
    //   116: dup
    //   117: instanceof java/lang/String
    //   120: ifne -> 125
    //   123: pop
    //   124: aconst_null
    //   125: checkcast java/lang/String
    //   128: dup
    //   129: ifnonnull -> 150
    //   132: pop
    //   133: new java/lang/IllegalStateException
    //   136: dup
    //   137: aload_2
    //   138: invokevirtual getFqdn : ()Ljava/lang/String;
    //   141: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: athrow
    //   150: goto -> 154
    //   153: aconst_null
    //   154: nop
    //   155: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #36	-> 6
    //   #135	-> 20
    //   #141	-> 20
    //   #142	-> 20
    //   #135	-> 27
    //   #142	-> 32
    //   #135	-> 34
    //   #144	-> 39
    //   #145	-> 41
    //   #146	-> 93
    //   #147	-> 98
    //   #135	-> 99
    //   #135	-> 100
    //   #141	-> 102
    //   #135	-> 107
    //   #141	-> 109
    //   #148	-> 111
    //   #141	-> 114
    //   #141	-> 150
    //   #135	-> 153
    //   #142	-> 154
    //   #36	-> 155
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	60	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	63	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   114	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   111	39	5	it$iv	Ljava/lang/Object;
    //   20	135	3	$i$f$getParameter	I
    //   18	137	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	137	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	156	0	$this$getPredictedOutput	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final String getStopToken(@NotNull Attributes $this$getStopToken) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getStopToken : ()Lai/grazie/utils/attributes/Attributes$Key$Text;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 153
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 93
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE : Lkotlinx/serialization/internal/StringSerializer;
    //   53: checkcast kotlinx/serialization/DeserializationStrategy
    //   56: aload #5
    //   58: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   61: invokevirtual getValue : ()Ljava/lang/String;
    //   64: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   67: dup
    //   68: ifnonnull -> 98
    //   71: pop
    //   72: aload_2
    //   73: invokevirtual getFqdn : ()Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   81: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   84: pop
    //   85: new kotlin/KotlinNothingValueException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: athrow
    //   93: aload #5
    //   95: invokevirtual getValue : ()Ljava/lang/Object;
    //   98: nop
    //   99: nop
    //   100: astore #7
    //   102: aload #7
    //   104: ifnull -> 153
    //   107: aload #7
    //   109: astore #5
    //   111: iconst_0
    //   112: istore #6
    //   114: aload #5
    //   116: dup
    //   117: instanceof java/lang/String
    //   120: ifne -> 125
    //   123: pop
    //   124: aconst_null
    //   125: checkcast java/lang/String
    //   128: dup
    //   129: ifnonnull -> 150
    //   132: pop
    //   133: new java/lang/IllegalStateException
    //   136: dup
    //   137: aload_2
    //   138: invokevirtual getFqdn : ()Ljava/lang/String;
    //   141: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: athrow
    //   150: goto -> 154
    //   153: aconst_null
    //   154: nop
    //   155: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #38	-> 6
    //   #149	-> 20
    //   #155	-> 20
    //   #156	-> 20
    //   #149	-> 27
    //   #156	-> 32
    //   #149	-> 34
    //   #158	-> 39
    //   #159	-> 41
    //   #160	-> 93
    //   #161	-> 98
    //   #149	-> 99
    //   #149	-> 100
    //   #155	-> 102
    //   #149	-> 107
    //   #155	-> 109
    //   #162	-> 111
    //   #155	-> 114
    //   #155	-> 150
    //   #149	-> 153
    //   #156	-> 154
    //   #38	-> 155
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	60	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	63	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   114	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   111	39	5	it$iv	Ljava/lang/Object;
    //   20	135	3	$i$f$getParameter	I
    //   18	137	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	137	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	156	0	$this$getStopToken	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final List<LLMFunction> getFunctions(@NotNull Attributes $this$getFunctions) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getFunctions : ()Lai/grazie/utils/attributes/Attributes$Key$Json;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 163
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 103
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: new kotlinx/serialization/internal/ArrayListSerializer
    //   53: dup
    //   54: getstatic ai/grazie/model/llm/chat/function/LLMFunction.Companion : Lai/grazie/model/llm/chat/function/LLMFunction$Companion;
    //   57: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   60: invokespecial <init> : (Lkotlinx/serialization/KSerializer;)V
    //   63: checkcast kotlinx/serialization/DeserializationStrategy
    //   66: aload #5
    //   68: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   71: invokevirtual getValue : ()Ljava/lang/String;
    //   74: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   77: dup
    //   78: ifnonnull -> 108
    //   81: pop
    //   82: aload_2
    //   83: invokevirtual getFqdn : ()Ljava/lang/String;
    //   86: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   91: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   94: pop
    //   95: new kotlin/KotlinNothingValueException
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: athrow
    //   103: aload #5
    //   105: invokevirtual getValue : ()Ljava/lang/Object;
    //   108: nop
    //   109: nop
    //   110: astore #7
    //   112: aload #7
    //   114: ifnull -> 163
    //   117: aload #7
    //   119: astore #5
    //   121: iconst_0
    //   122: istore #6
    //   124: aload #5
    //   126: dup
    //   127: instanceof java/util/List
    //   130: ifne -> 135
    //   133: pop
    //   134: aconst_null
    //   135: checkcast java/util/List
    //   138: dup
    //   139: ifnonnull -> 160
    //   142: pop
    //   143: new java/lang/IllegalStateException
    //   146: dup
    //   147: aload_2
    //   148: invokevirtual getFqdn : ()Ljava/lang/String;
    //   151: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: athrow
    //   160: goto -> 164
    //   163: aconst_null
    //   164: nop
    //   165: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #40	-> 6
    //   #163	-> 20
    //   #169	-> 20
    //   #170	-> 20
    //   #163	-> 27
    //   #170	-> 32
    //   #163	-> 34
    //   #172	-> 39
    //   #173	-> 41
    //   #174	-> 103
    //   #175	-> 108
    //   #163	-> 109
    //   #163	-> 110
    //   #169	-> 112
    //   #163	-> 117
    //   #169	-> 119
    //   #176	-> 121
    //   #169	-> 124
    //   #169	-> 160
    //   #163	-> 163
    //   #170	-> 164
    //   #40	-> 165
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	70	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	73	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   124	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   121	39	5	it$iv	Ljava/lang/Object;
    //   20	145	3	$i$f$getParameter	I
    //   18	147	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	147	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	166	0	$this$getFunctions	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final LLMFunctionCall getFunctionCall(@NotNull Attributes $this$getFunctionCall) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getFunctionCall : ()Lai/grazie/utils/attributes/Attributes$Key$Json;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic ai/grazie/model/llm/chat/function/LLMFunctionCall.Companion : Lai/grazie/model/llm/chat/function/LLMFunctionCall$Companion;
    //   53: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof ai/grazie/model/llm/chat/function/LLMFunctionCall
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast ai/grazie/model/llm/chat/function/LLMFunctionCall
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #42	-> 6
    //   #177	-> 20
    //   #183	-> 20
    //   #184	-> 20
    //   #177	-> 27
    //   #184	-> 32
    //   #177	-> 34
    //   #186	-> 39
    //   #187	-> 41
    //   #188	-> 96
    //   #189	-> 101
    //   #177	-> 102
    //   #177	-> 103
    //   #183	-> 105
    //   #177	-> 110
    //   #183	-> 112
    //   #190	-> 114
    //   #183	-> 117
    //   #183	-> 153
    //   #177	-> 156
    //   #184	-> 157
    //   #42	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getFunctionCall	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final String getReasoningEffort(@NotNull Attributes $this$getReasoningEffort) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getReasoningEffort : ()Lai/grazie/utils/attributes/Attributes$Key$Text;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 153
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 93
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE : Lkotlinx/serialization/internal/StringSerializer;
    //   53: checkcast kotlinx/serialization/DeserializationStrategy
    //   56: aload #5
    //   58: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   61: invokevirtual getValue : ()Ljava/lang/String;
    //   64: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   67: dup
    //   68: ifnonnull -> 98
    //   71: pop
    //   72: aload_2
    //   73: invokevirtual getFqdn : ()Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   81: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   84: pop
    //   85: new kotlin/KotlinNothingValueException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: athrow
    //   93: aload #5
    //   95: invokevirtual getValue : ()Ljava/lang/Object;
    //   98: nop
    //   99: nop
    //   100: astore #7
    //   102: aload #7
    //   104: ifnull -> 153
    //   107: aload #7
    //   109: astore #5
    //   111: iconst_0
    //   112: istore #6
    //   114: aload #5
    //   116: dup
    //   117: instanceof java/lang/String
    //   120: ifne -> 125
    //   123: pop
    //   124: aconst_null
    //   125: checkcast java/lang/String
    //   128: dup
    //   129: ifnonnull -> 150
    //   132: pop
    //   133: new java/lang/IllegalStateException
    //   136: dup
    //   137: aload_2
    //   138: invokevirtual getFqdn : ()Ljava/lang/String;
    //   141: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: athrow
    //   150: goto -> 154
    //   153: aconst_null
    //   154: nop
    //   155: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #44	-> 6
    //   #191	-> 20
    //   #197	-> 20
    //   #198	-> 20
    //   #191	-> 27
    //   #198	-> 32
    //   #191	-> 34
    //   #200	-> 39
    //   #201	-> 41
    //   #202	-> 93
    //   #203	-> 98
    //   #191	-> 99
    //   #191	-> 100
    //   #197	-> 102
    //   #191	-> 107
    //   #197	-> 109
    //   #204	-> 111
    //   #197	-> 114
    //   #197	-> 150
    //   #191	-> 153
    //   #198	-> 154
    //   #44	-> 155
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	60	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	63	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   114	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   111	39	5	it$iv	Ljava/lang/Object;
    //   20	135	3	$i$f$getParameter	I
    //   18	137	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	137	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	156	0	$this$getReasoningEffort	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final Long getNumberOfChoices(@NotNull Attributes $this$getNumberOfChoices) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getNumberOfChoices : ()Lai/grazie/utils/attributes/Attributes$Key$Long;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 153
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 93
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic kotlinx/serialization/internal/LongSerializer.INSTANCE : Lkotlinx/serialization/internal/LongSerializer;
    //   53: checkcast kotlinx/serialization/DeserializationStrategy
    //   56: aload #5
    //   58: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   61: invokevirtual getValue : ()Ljava/lang/String;
    //   64: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   67: dup
    //   68: ifnonnull -> 98
    //   71: pop
    //   72: aload_2
    //   73: invokevirtual getFqdn : ()Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   81: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   84: pop
    //   85: new kotlin/KotlinNothingValueException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: athrow
    //   93: aload #5
    //   95: invokevirtual getValue : ()Ljava/lang/Object;
    //   98: nop
    //   99: nop
    //   100: astore #7
    //   102: aload #7
    //   104: ifnull -> 153
    //   107: aload #7
    //   109: astore #5
    //   111: iconst_0
    //   112: istore #6
    //   114: aload #5
    //   116: dup
    //   117: instanceof java/lang/Long
    //   120: ifne -> 125
    //   123: pop
    //   124: aconst_null
    //   125: checkcast java/lang/Long
    //   128: dup
    //   129: ifnonnull -> 150
    //   132: pop
    //   133: new java/lang/IllegalStateException
    //   136: dup
    //   137: aload_2
    //   138: invokevirtual getFqdn : ()Ljava/lang/String;
    //   141: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   146: invokespecial <init> : (Ljava/lang/String;)V
    //   149: athrow
    //   150: goto -> 154
    //   153: aconst_null
    //   154: nop
    //   155: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #46	-> 6
    //   #205	-> 20
    //   #211	-> 20
    //   #212	-> 20
    //   #205	-> 27
    //   #212	-> 32
    //   #205	-> 34
    //   #214	-> 39
    //   #215	-> 41
    //   #216	-> 93
    //   #217	-> 98
    //   #205	-> 99
    //   #205	-> 100
    //   #211	-> 102
    //   #205	-> 107
    //   #211	-> 109
    //   #218	-> 111
    //   #211	-> 114
    //   #211	-> 150
    //   #205	-> 153
    //   #212	-> 154
    //   #46	-> 155
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	60	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	63	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   114	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   111	39	5	it$iv	Ljava/lang/Object;
    //   20	135	3	$i$f$getParameter	I
    //   18	137	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	137	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	156	0	$this$getNumberOfChoices	Lai/grazie/utils/attributes/Attributes;
  }
  
  @Nullable
  public static final LLMCachePoints getCachePoints(@NotNull Attributes $this$getCachePoints) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
    //   11: invokevirtual getCachePoints : ()Lai/grazie/utils/attributes/Attributes$Key$Json;
    //   14: checkcast ai/grazie/utils/attributes/Attributes$Key
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 156
    //   32: aload #4
    //   34: astore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: aload #5
    //   41: instanceof ai/grazie/utils/attributes/Attributes$Value$Json
    //   44: ifeq -> 96
    //   47: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
    //   50: getstatic ai/grazie/model/llm/chat/caching/LLMCachePoints.Companion : Lai/grazie/model/llm/chat/caching/LLMCachePoints$Companion;
    //   53: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   56: checkcast kotlinx/serialization/DeserializationStrategy
    //   59: aload #5
    //   61: checkcast ai/grazie/utils/attributes/Attributes$Value$Json
    //   64: invokevirtual getValue : ()Ljava/lang/String;
    //   67: invokevirtual parseOrNull : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   70: dup
    //   71: ifnonnull -> 101
    //   74: pop
    //   75: aload_2
    //   76: invokevirtual getFqdn : ()Ljava/lang/String;
    //   79: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   84: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
    //   87: pop
    //   88: new kotlin/KotlinNothingValueException
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: athrow
    //   96: aload #5
    //   98: invokevirtual getValue : ()Ljava/lang/Object;
    //   101: nop
    //   102: nop
    //   103: astore #7
    //   105: aload #7
    //   107: ifnull -> 156
    //   110: aload #7
    //   112: astore #5
    //   114: iconst_0
    //   115: istore #6
    //   117: aload #5
    //   119: dup
    //   120: instanceof ai/grazie/model/llm/chat/caching/LLMCachePoints
    //   123: ifne -> 128
    //   126: pop
    //   127: aconst_null
    //   128: checkcast ai/grazie/model/llm/chat/caching/LLMCachePoints
    //   131: dup
    //   132: ifnonnull -> 153
    //   135: pop
    //   136: new java/lang/IllegalStateException
    //   139: dup
    //   140: aload_2
    //   141: invokevirtual getFqdn : ()Ljava/lang/String;
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: athrow
    //   153: goto -> 157
    //   156: aconst_null
    //   157: nop
    //   158: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #48	-> 6
    //   #219	-> 20
    //   #225	-> 20
    //   #226	-> 20
    //   #219	-> 27
    //   #226	-> 32
    //   #219	-> 34
    //   #228	-> 39
    //   #229	-> 41
    //   #230	-> 96
    //   #231	-> 101
    //   #219	-> 102
    //   #219	-> 103
    //   #225	-> 105
    //   #219	-> 110
    //   #225	-> 112
    //   #232	-> 114
    //   #225	-> 117
    //   #225	-> 153
    //   #219	-> 156
    //   #226	-> 157
    //   #48	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	63	6	$i$a$-let-AttributesExtensionKt$getParameter$1$iv	I
    //   36	66	5	it$iv	Lai/grazie/utils/attributes/Attributes$Value;
    //   117	36	6	$i$a$-let-AttributesExtensionKt$getParameter$2$iv	I
    //   114	39	5	it$iv	Ljava/lang/Object;
    //   20	138	3	$i$f$getParameter	I
    //   18	140	1	$this$getParameter$iv	Lai/grazie/utils/attributes/Attributes;
    //   18	140	2	key$iv	Lai/grazie/utils/attributes/Attributes$Key;
    //   0	159	0	$this$getCachePoints	Lai/grazie/utils/attributes/Attributes;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\ll\\utils\AttributesExtensionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */