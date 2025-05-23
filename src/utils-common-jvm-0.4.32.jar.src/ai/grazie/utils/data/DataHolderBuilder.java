/*    */ package ai.grazie.utils.data;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\020\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\006\n\002\b\002\n\002\020\b\n\002\b\004\b\007\030\0002\0020\001B\007\b\000¢\006\002\020\002J\035\020\007\032\0020\b2\006\020\t\032\0020\0052\b\020\n\032\004\030\0010\013¢\006\002\020\fJ\r\020\r\032\0020\016H\000¢\006\002\b\017J\035\020\020\032\0020\b2\006\020\t\032\0020\0052\006\020\n\032\0020\006H\000¢\006\002\b\021J\035\020\022\032\0020\b2\006\020\t\032\0020\0052\b\020\n\032\004\030\0010\023¢\006\002\020\024J\035\020\025\032\0020\b2\006\020\t\032\0020\0052\b\020\n\032\004\030\0010\026¢\006\002\020\027J\030\020\030\032\0020\b2\006\020\t\032\0020\0052\b\020\n\032\004\030\0010\005J\030\020\031\032\0020\b2\006\020\t\032\0020\0052\b\020\n\032\004\030\0010\005R\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lai/grazie/utils/data/DataHolderBuilder;", "", "()V", "parameters", "", "", "Lkotlinx/serialization/json/JsonElement;", "bool", "", "key", "value", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "build", "Lai/grazie/utils/data/DataHolder;", "build$utils_common", "doPut", "doPut$utils_common", "double", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "int", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "json", "text", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nDataHolderBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHolderBuilder.kt\nai/grazie/utils/data/DataHolderBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DataHolderBuilder.kt\nai/grazie/utils/data/DataHolderBuilderKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,51:1\n1#2:52\n1#2:54\n1#2:59\n1#2:64\n1#2:69\n43#3:53\n45#3:55\n46#3:57\n43#3:58\n45#3:60\n46#3:62\n43#3:63\n45#3:65\n46#3:67\n43#3:68\n45#3:70\n46#3:72\n32#4:56\n32#4:61\n32#4:66\n32#4:71\n*S KotlinDebug\n*F\n+ 1 DataHolderBuilder.kt\nai/grazie/utils/data/DataHolderBuilder\n*L\n20#1:54\n24#1:59\n28#1:64\n32#1:69\n20#1:53\n20#1:55\n20#1:57\n24#1:58\n24#1:60\n24#1:62\n28#1:63\n28#1:65\n28#1:67\n32#1:68\n32#1:70\n32#1:72\n20#1:56\n24#1:61\n28#1:66\n32#1:71\n*E\n"})
/*    */ public final class DataHolderBuilder {
/*    */   @NotNull
/* 12 */   private final Map<String, JsonElement> parameters = new LinkedHashMap<>();
/*    */   
/*    */   public final void doPut$utils_common(@NotNull String key, @NotNull JsonElement value) {
/* 15 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); JsonElement old = this.parameters.put(key, value);
/* 16 */     if (!((old == null) ? 1 : 0)) {
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
/* 52 */       int $i$a$-require-DataHolderBuilder$doPut$1 = 0;
/*    */       String str = "Overwriting key '" + key + "'";
/*    */       throw new IllegalArgumentException(str.toString());
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void text(@NotNull String key, @Nullable String value) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'key'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: astore_3
/*    */     //   8: iconst_0
/*    */     //   9: istore #4
/*    */     //   11: ldc java/lang/String
/*    */     //   13: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   16: invokestatic serializerOrNull : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   19: dup
/*    */     //   20: ifnonnull -> 57
/*    */     //   23: pop
/*    */     //   24: iconst_0
/*    */     //   25: istore #5
/*    */     //   27: ldc java/lang/String
/*    */     //   29: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   32: invokeinterface getSimpleName : ()Ljava/lang/String;
/*    */     //   37: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   42: astore #5
/*    */     //   44: new java/lang/IllegalStateException
/*    */     //   47: dup
/*    */     //   48: aload #5
/*    */     //   50: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   53: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   56: athrow
/*    */     //   57: pop
/*    */     //   58: aload_3
/*    */     //   59: aload_1
/*    */     //   60: aload_2
/*    */     //   61: dup
/*    */     //   62: ifnull -> 115
/*    */     //   65: astore #6
/*    */     //   67: astore #7
/*    */     //   69: astore #8
/*    */     //   71: iconst_0
/*    */     //   72: istore #9
/*    */     //   74: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   77: checkcast ai/grazie/utils/json/JSON
/*    */     //   80: astore #10
/*    */     //   82: iconst_0
/*    */     //   83: istore #11
/*    */     //   85: aload #10
/*    */     //   87: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*    */     //   90: getstatic kotlinx/serialization/internal/StringSerializer.INSTANCE : Lkotlinx/serialization/internal/StringSerializer;
/*    */     //   93: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   96: aload #6
/*    */     //   98: invokevirtual encodeToJsonElement : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
/*    */     //   101: nop
/*    */     //   102: astore #12
/*    */     //   104: aload #8
/*    */     //   106: aload #7
/*    */     //   108: aload #12
/*    */     //   110: nop
/*    */     //   111: dup
/*    */     //   112: ifnonnull -> 122
/*    */     //   115: pop
/*    */     //   116: getstatic kotlinx/serialization/json/JsonNull.INSTANCE : Lkotlinx/serialization/json/JsonNull;
/*    */     //   119: checkcast kotlinx/serialization/json/JsonElement
/*    */     //   122: invokestatic jsonElement : (Lai/grazie/utils/data/DataHolderBuilder;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
/*    */     //   125: nop
/*    */     //   126: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 6
/*    */     //   #53	-> 11
/*    */     //   #54	-> 24
/*    */     //   #53	-> 32
/*    */     //   #53	-> 42
/*    */     //   #55	-> 58
/*    */     //   #54	-> 67
/*    */     //   #55	-> 74
/*    */     //   #56	-> 85
/*    */     //   #55	-> 101
/*    */     //   #55	-> 110
/*    */     //   #55	-> 111
/*    */     //   #57	-> 125
/*    */     //   #21	-> 126
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   27	15	5	$i$a$-checkNotNull-DataHolderBuilderKt$value$1$iv	I
/*    */     //   85	16	11	$i$f$jsonElement	I
/*    */     //   82	19	10	this_$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   74	28	9	$i$a$-let-DataHolderBuilderKt$value$2$iv	I
/*    */     //   71	31	6	it$iv	Ljava/lang/Object;
/*    */     //   11	115	4	$i$f$value	I
/*    */     //   8	118	3	$this$value$iv	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	127	0	this	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	127	1	key	Ljava/lang/String;
/*    */     //   0	127	2	value	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   public final void bool(@NotNull String key, @Nullable Boolean value) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'key'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: astore_3
/*    */     //   8: iconst_0
/*    */     //   9: istore #4
/*    */     //   11: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
/*    */     //   14: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   17: invokestatic serializerOrNull : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   20: dup
/*    */     //   21: ifnonnull -> 58
/*    */     //   24: pop
/*    */     //   25: iconst_0
/*    */     //   26: istore #5
/*    */     //   28: ldc java/lang/Boolean
/*    */     //   30: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   33: invokeinterface getSimpleName : ()Ljava/lang/String;
/*    */     //   38: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   43: astore #5
/*    */     //   45: new java/lang/IllegalStateException
/*    */     //   48: dup
/*    */     //   49: aload #5
/*    */     //   51: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   57: athrow
/*    */     //   58: pop
/*    */     //   59: aload_3
/*    */     //   60: aload_1
/*    */     //   61: aload_2
/*    */     //   62: dup
/*    */     //   63: ifnull -> 116
/*    */     //   66: astore #6
/*    */     //   68: astore #7
/*    */     //   70: astore #8
/*    */     //   72: iconst_0
/*    */     //   73: istore #9
/*    */     //   75: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   78: checkcast ai/grazie/utils/json/JSON
/*    */     //   81: astore #10
/*    */     //   83: iconst_0
/*    */     //   84: istore #11
/*    */     //   86: aload #10
/*    */     //   88: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*    */     //   91: getstatic kotlinx/serialization/internal/BooleanSerializer.INSTANCE : Lkotlinx/serialization/internal/BooleanSerializer;
/*    */     //   94: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   97: aload #6
/*    */     //   99: invokevirtual encodeToJsonElement : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
/*    */     //   102: nop
/*    */     //   103: astore #12
/*    */     //   105: aload #8
/*    */     //   107: aload #7
/*    */     //   109: aload #12
/*    */     //   111: nop
/*    */     //   112: dup
/*    */     //   113: ifnonnull -> 123
/*    */     //   116: pop
/*    */     //   117: getstatic kotlinx/serialization/json/JsonNull.INSTANCE : Lkotlinx/serialization/json/JsonNull;
/*    */     //   120: checkcast kotlinx/serialization/json/JsonElement
/*    */     //   123: invokestatic jsonElement : (Lai/grazie/utils/data/DataHolderBuilder;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
/*    */     //   126: nop
/*    */     //   127: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 6
/*    */     //   #58	-> 11
/*    */     //   #59	-> 25
/*    */     //   #58	-> 33
/*    */     //   #58	-> 43
/*    */     //   #60	-> 59
/*    */     //   #59	-> 68
/*    */     //   #60	-> 75
/*    */     //   #61	-> 86
/*    */     //   #60	-> 102
/*    */     //   #60	-> 111
/*    */     //   #60	-> 112
/*    */     //   #62	-> 126
/*    */     //   #25	-> 127
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   28	15	5	$i$a$-checkNotNull-DataHolderBuilderKt$value$1$iv	I
/*    */     //   86	16	11	$i$f$jsonElement	I
/*    */     //   83	19	10	this_$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   75	28	9	$i$a$-let-DataHolderBuilderKt$value$2$iv	I
/*    */     //   72	31	6	it$iv	Ljava/lang/Object;
/*    */     //   11	116	4	$i$f$value	I
/*    */     //   8	119	3	$this$value$iv	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	128	0	this	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	128	1	key	Ljava/lang/String;
/*    */     //   0	128	2	value	Ljava/lang/Boolean;
/*    */   }
/*    */   
/*    */   public final void int(@NotNull String key, @Nullable Integer value) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'key'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: astore_3
/*    */     //   8: iconst_0
/*    */     //   9: istore #4
/*    */     //   11: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*    */     //   14: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   17: invokestatic serializerOrNull : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   20: dup
/*    */     //   21: ifnonnull -> 58
/*    */     //   24: pop
/*    */     //   25: iconst_0
/*    */     //   26: istore #5
/*    */     //   28: ldc java/lang/Integer
/*    */     //   30: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   33: invokeinterface getSimpleName : ()Ljava/lang/String;
/*    */     //   38: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   43: astore #5
/*    */     //   45: new java/lang/IllegalStateException
/*    */     //   48: dup
/*    */     //   49: aload #5
/*    */     //   51: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   57: athrow
/*    */     //   58: pop
/*    */     //   59: aload_3
/*    */     //   60: aload_1
/*    */     //   61: aload_2
/*    */     //   62: dup
/*    */     //   63: ifnull -> 116
/*    */     //   66: astore #6
/*    */     //   68: astore #7
/*    */     //   70: astore #8
/*    */     //   72: iconst_0
/*    */     //   73: istore #9
/*    */     //   75: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   78: checkcast ai/grazie/utils/json/JSON
/*    */     //   81: astore #10
/*    */     //   83: iconst_0
/*    */     //   84: istore #11
/*    */     //   86: aload #10
/*    */     //   88: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*    */     //   91: getstatic kotlinx/serialization/internal/IntSerializer.INSTANCE : Lkotlinx/serialization/internal/IntSerializer;
/*    */     //   94: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   97: aload #6
/*    */     //   99: invokevirtual encodeToJsonElement : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
/*    */     //   102: nop
/*    */     //   103: astore #12
/*    */     //   105: aload #8
/*    */     //   107: aload #7
/*    */     //   109: aload #12
/*    */     //   111: nop
/*    */     //   112: dup
/*    */     //   113: ifnonnull -> 123
/*    */     //   116: pop
/*    */     //   117: getstatic kotlinx/serialization/json/JsonNull.INSTANCE : Lkotlinx/serialization/json/JsonNull;
/*    */     //   120: checkcast kotlinx/serialization/json/JsonElement
/*    */     //   123: invokestatic jsonElement : (Lai/grazie/utils/data/DataHolderBuilder;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
/*    */     //   126: nop
/*    */     //   127: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 6
/*    */     //   #63	-> 11
/*    */     //   #64	-> 25
/*    */     //   #63	-> 33
/*    */     //   #63	-> 43
/*    */     //   #65	-> 59
/*    */     //   #64	-> 68
/*    */     //   #65	-> 75
/*    */     //   #66	-> 86
/*    */     //   #65	-> 102
/*    */     //   #65	-> 111
/*    */     //   #65	-> 112
/*    */     //   #67	-> 126
/*    */     //   #29	-> 127
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   28	15	5	$i$a$-checkNotNull-DataHolderBuilderKt$value$1$iv	I
/*    */     //   86	16	11	$i$f$jsonElement	I
/*    */     //   83	19	10	this_$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   75	28	9	$i$a$-let-DataHolderBuilderKt$value$2$iv	I
/*    */     //   72	31	6	it$iv	Ljava/lang/Object;
/*    */     //   11	116	4	$i$f$value	I
/*    */     //   8	119	3	$this$value$iv	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	128	0	this	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	128	1	key	Ljava/lang/String;
/*    */     //   0	128	2	value	Ljava/lang/Integer;
/*    */   }
/*    */   
/*    */   public final void double(@NotNull String key, @Nullable Double value) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'key'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: astore_3
/*    */     //   8: iconst_0
/*    */     //   9: istore #4
/*    */     //   11: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
/*    */     //   14: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   17: invokestatic serializerOrNull : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   20: dup
/*    */     //   21: ifnonnull -> 58
/*    */     //   24: pop
/*    */     //   25: iconst_0
/*    */     //   26: istore #5
/*    */     //   28: ldc java/lang/Double
/*    */     //   30: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*    */     //   33: invokeinterface getSimpleName : ()Ljava/lang/String;
/*    */     //   38: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   43: astore #5
/*    */     //   45: new java/lang/IllegalStateException
/*    */     //   48: dup
/*    */     //   49: aload #5
/*    */     //   51: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   57: athrow
/*    */     //   58: pop
/*    */     //   59: aload_3
/*    */     //   60: aload_1
/*    */     //   61: aload_2
/*    */     //   62: dup
/*    */     //   63: ifnull -> 116
/*    */     //   66: astore #6
/*    */     //   68: astore #7
/*    */     //   70: astore #8
/*    */     //   72: iconst_0
/*    */     //   73: istore #9
/*    */     //   75: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   78: checkcast ai/grazie/utils/json/JSON
/*    */     //   81: astore #10
/*    */     //   83: iconst_0
/*    */     //   84: istore #11
/*    */     //   86: aload #10
/*    */     //   88: invokevirtual getJson : ()Lkotlinx/serialization/json/Json;
/*    */     //   91: getstatic kotlinx/serialization/internal/DoubleSerializer.INSTANCE : Lkotlinx/serialization/internal/DoubleSerializer;
/*    */     //   94: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   97: aload #6
/*    */     //   99: invokevirtual encodeToJsonElement : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
/*    */     //   102: nop
/*    */     //   103: astore #12
/*    */     //   105: aload #8
/*    */     //   107: aload #7
/*    */     //   109: aload #12
/*    */     //   111: nop
/*    */     //   112: dup
/*    */     //   113: ifnonnull -> 123
/*    */     //   116: pop
/*    */     //   117: getstatic kotlinx/serialization/json/JsonNull.INSTANCE : Lkotlinx/serialization/json/JsonNull;
/*    */     //   120: checkcast kotlinx/serialization/json/JsonElement
/*    */     //   123: invokestatic jsonElement : (Lai/grazie/utils/data/DataHolderBuilder;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
/*    */     //   126: nop
/*    */     //   127: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 6
/*    */     //   #68	-> 11
/*    */     //   #69	-> 25
/*    */     //   #68	-> 33
/*    */     //   #68	-> 43
/*    */     //   #70	-> 59
/*    */     //   #69	-> 68
/*    */     //   #70	-> 75
/*    */     //   #71	-> 86
/*    */     //   #70	-> 102
/*    */     //   #70	-> 111
/*    */     //   #70	-> 112
/*    */     //   #72	-> 126
/*    */     //   #33	-> 127
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   28	15	5	$i$a$-checkNotNull-DataHolderBuilderKt$value$1$iv	I
/*    */     //   86	16	11	$i$f$jsonElement	I
/*    */     //   83	19	10	this_$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   75	28	9	$i$a$-let-DataHolderBuilderKt$value$2$iv	I
/*    */     //   72	31	6	it$iv	Ljava/lang/Object;
/*    */     //   11	116	4	$i$f$value	I
/*    */     //   8	119	3	$this$value$iv	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	128	0	this	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	128	1	key	Ljava/lang/String;
/*    */     //   0	128	2	value	Ljava/lang/Double;
/*    */   }
/*    */   
/*    */   public final void json(@NotNull String key, @Nullable String value) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'key'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: aload_1
/*    */     //   8: aload_2
/*    */     //   9: dup
/*    */     //   10: ifnull -> 41
/*    */     //   13: astore_3
/*    */     //   14: astore #6
/*    */     //   16: astore #5
/*    */     //   18: iconst_0
/*    */     //   19: istore #4
/*    */     //   21: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   24: aload_3
/*    */     //   25: invokevirtual parseJsonElement : (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
/*    */     //   28: astore #7
/*    */     //   30: aload #5
/*    */     //   32: aload #6
/*    */     //   34: aload #7
/*    */     //   36: nop
/*    */     //   37: dup
/*    */     //   38: ifnonnull -> 48
/*    */     //   41: pop
/*    */     //   42: getstatic kotlinx/serialization/json/JsonNull.INSTANCE : Lkotlinx/serialization/json/JsonNull;
/*    */     //   45: checkcast kotlinx/serialization/json/JsonElement
/*    */     //   48: invokevirtual doPut$utils_common : (Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
/*    */     //   51: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 6
/*    */     //   #52	-> 14
/*    */     //   #36	-> 21
/*    */     //   #36	-> 36
/*    */     //   #36	-> 37
/*    */     //   #37	-> 51
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   21	7	4	$i$a$-let-DataHolderBuilder$json$1	I
/*    */     //   18	10	3	it	Ljava/lang/String;
/*    */     //   0	52	0	this	Lai/grazie/utils/data/DataHolderBuilder;
/*    */     //   0	52	1	key	Ljava/lang/String;
/*    */     //   0	52	2	value	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DataHolder build$utils_common() {
/*    */     return new DataHolder(this.parameters);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\DataHolderBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */