/*    */ package ai.grazie.model.llm.chat.function;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionCall$LLMFunctionCallSerializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMFunctionCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMFunctionCall.kt\nai/grazie/model/llm/chat/function/LLMFunctionCall$LLMFunctionCallSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/*    */ public final class LLMFunctionCallSerializer
/*    */   implements KSerializer<LLMFunctionCall>
/*    */ {
/*    */   @NotNull
/* 45 */   public static final LLMFunctionCallSerializer INSTANCE = new LLMFunctionCallSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor$default("FunctionCall", new SerialDescriptor[0], null, 4, null); @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public LLMFunctionCall deserialize(@NotNull Decoder decoder) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'decoder'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: instanceof kotlinx/serialization/json/JsonDecoder
/*    */     //   10: ifne -> 30
/*    */     //   13: iconst_0
/*    */     //   14: istore_3
/*    */     //   15: ldc 'This decoder is not a JsonDecoder. Cannot deserialize `FunctionCall`'
/*    */     //   17: astore_3
/*    */     //   18: new java/lang/IllegalArgumentException
/*    */     //   21: dup
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   26: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   29: athrow
/*    */     //   30: aload_1
/*    */     //   31: checkcast kotlinx/serialization/json/JsonDecoder
/*    */     //   34: invokeinterface decodeJsonElement : ()Lkotlinx/serialization/json/JsonElement;
/*    */     //   39: astore_2
/*    */     //   40: aload_2
/*    */     //   41: instanceof kotlinx/serialization/json/JsonPrimitive
/*    */     //   44: ifeq -> 127
/*    */     //   47: aload_2
/*    */     //   48: checkcast kotlinx/serialization/json/JsonPrimitive
/*    */     //   51: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   54: astore #5
/*    */     //   56: iconst_0
/*    */     //   57: istore #6
/*    */     //   59: new ai/grazie/model/llm/chat/function/LLMFunctionCall$Default
/*    */     //   62: dup
/*    */     //   63: aload #5
/*    */     //   65: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   68: nop
/*    */     //   69: astore #4
/*    */     //   71: aload #4
/*    */     //   73: astore #5
/*    */     //   75: iconst_0
/*    */     //   76: istore #6
/*    */     //   78: getstatic ai/grazie/model/llm/chat/function/LLMFunctionCall.Companion : Lai/grazie/model/llm/chat/function/LLMFunctionCall$Companion;
/*    */     //   81: invokevirtual getDefaults$model_llm : ()[Lai/grazie/model/llm/chat/function/LLMFunctionCall;
/*    */     //   84: aload #5
/*    */     //   86: invokestatic contains : ([Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   89: ifeq -> 97
/*    */     //   92: aload #4
/*    */     //   94: goto -> 98
/*    */     //   97: aconst_null
/*    */     //   98: dup
/*    */     //   99: ifnonnull -> 121
/*    */     //   102: pop
/*    */     //   103: aload_2
/*    */     //   104: <illegal opcode> makeConcatWithConstants : (Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;
/*    */     //   109: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
/*    */     //   112: pop
/*    */     //   113: new kotlin/KotlinNothingValueException
/*    */     //   116: dup
/*    */     //   117: invokespecial <init> : ()V
/*    */     //   120: athrow
/*    */     //   121: checkcast ai/grazie/model/llm/chat/function/LLMFunctionCall
/*    */     //   124: goto -> 213
/*    */     //   127: aload_2
/*    */     //   128: instanceof kotlinx/serialization/json/JsonObject
/*    */     //   131: ifeq -> 203
/*    */     //   134: aload_2
/*    */     //   135: checkcast kotlinx/serialization/json/JsonObject
/*    */     //   138: ldc 'functionName'
/*    */     //   140: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   143: checkcast kotlinx/serialization/json/JsonElement
/*    */     //   146: dup
/*    */     //   147: ifnull -> 182
/*    */     //   150: invokestatic getJsonPrimitive : (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
/*    */     //   153: dup
/*    */     //   154: ifnull -> 182
/*    */     //   157: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   160: dup
/*    */     //   161: ifnull -> 182
/*    */     //   164: astore #7
/*    */     //   166: iconst_0
/*    */     //   167: istore #8
/*    */     //   169: new ai/grazie/model/llm/chat/function/LLMFunctionCall$Named
/*    */     //   172: dup
/*    */     //   173: aload #7
/*    */     //   175: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   178: nop
/*    */     //   179: goto -> 197
/*    */     //   182: pop
/*    */     //   183: ldc 'Missing 'name''
/*    */     //   185: invokestatic badRequest : (Ljava/lang/String;)Ljava/lang/Void;
/*    */     //   188: pop
/*    */     //   189: new kotlin/KotlinNothingValueException
/*    */     //   192: dup
/*    */     //   193: invokespecial <init> : ()V
/*    */     //   196: athrow
/*    */     //   197: checkcast ai/grazie/model/llm/chat/function/LLMFunctionCall
/*    */     //   200: goto -> 213
/*    */     //   203: new java/lang/UnsupportedOperationException
/*    */     //   206: dup
/*    */     //   207: ldc 'Cannot deserialize FunctionCall. Unsupported JSON element.'
/*    */     //   209: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   212: athrow
/*    */     //   213: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 6
/*    */     //   #66	-> 13
/*    */     //   #48	-> 15
/*    */     //   #48	-> 17
/*    */     //   #49	-> 30
/*    */     //   #50	-> 40
/*    */     //   #66	-> 56
/*    */     //   #50	-> 59
/*    */     //   #50	-> 68
/*    */     //   #50	-> 69
/*    */     //   #66	-> 75
/*    */     //   #50	-> 78
/*    */     //   #50	-> 89
/*    */     //   #50	-> 98
/*    */     //   #51	-> 127
/*    */     //   #66	-> 166
/*    */     //   #51	-> 169
/*    */     //   #51	-> 178
/*    */     //   #51	-> 179
/*    */     //   #52	-> 203
/*    */     //   #49	-> 213
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   15	2	3	$i$a$-require-LLMFunctionCall$LLMFunctionCallSerializer$deserialize$1	I
/*    */     //   59	9	6	$i$a$-let-LLMFunctionCall$LLMFunctionCallSerializer$deserialize$2	I
/*    */     //   56	12	5	p0	Ljava/lang/String;
/*    */     //   78	11	6	$i$a$-takeIf-LLMFunctionCall$LLMFunctionCallSerializer$deserialize$3	I
/*    */     //   75	14	5	it	Lai/grazie/model/llm/chat/function/LLMFunctionCall$Default;
/*    */     //   169	9	8	$i$a$-let-LLMFunctionCall$LLMFunctionCallSerializer$deserialize$4	I
/*    */     //   166	12	7	p0	Ljava/lang/String;
/*    */     //   40	173	2	json	Lkotlinx/serialization/json/JsonElement;
/*    */     //   0	214	0	this	Lai/grazie/model/llm/chat/function/LLMFunctionCall$LLMFunctionCallSerializer;
/*    */     //   0	214	1	decoder	Lkotlinx/serialization/encoding/Decoder;
/*    */   }
/*    */ 
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull LLMFunctionCall value) {
/* 57 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); if (!(encoder instanceof kotlinx.serialization.json.JsonEncoder)) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 66 */       int $i$a$-require-LLMFunctionCall$LLMFunctionCallSerializer$serialize$1 = 0;
/*    */       String str = "This encoder is not a JsonEncoder. Cannot serialize `FunctionCall`";
/*    */       throw new IllegalArgumentException(str.toString());
/*    */     } 
/*    */     LLMFunctionCall lLMFunctionCall = value;
/*    */     if (lLMFunctionCall instanceof LLMFunctionCall.Default) {
/*    */       encoder.encodeString(((LLMFunctionCall.Default)value).getValue());
/*    */     } else if (lLMFunctionCall instanceof LLMFunctionCall.Named) {
/*    */       LLMFunctionCall.Named.Companion.serializer().serialize(encoder, value);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\function\LLMFunctionCall$LLMFunctionCallSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */