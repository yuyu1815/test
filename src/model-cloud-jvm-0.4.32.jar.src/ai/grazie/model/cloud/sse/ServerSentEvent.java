/*    */ package ai.grazie.model.cloud.sse;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\020\t\n\002\b\002\n\002\030\002\n\002\b\022\n\002\020\013\n\002\b\007\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 02\0020\001:\003./0BK\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\005\022\b\020\013\032\004\030\0010\f¢\006\002\020\rBA\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\005\022\n\b\002\020\007\032\004\030\0010\005\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\005¢\006\002\020\016J\013\020\027\032\004\030\0010\005HÆ\003J\013\020\030\032\004\030\0010\005HÆ\003J\013\020\031\032\004\030\0010\005HÆ\003J\020\020\032\032\004\030\0010\tHÆ\003¢\006\002\020\025J\013\020\033\032\004\030\0010\005HÆ\003JJ\020\034\032\0020\0002\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\0052\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\005HÆ\001¢\006\002\020\035J\023\020\036\032\0020\0372\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\003HÖ\001J\006\020\"\032\0020\037J\006\020#\032\0020\037J\t\020$\032\0020\005HÖ\001J\006\020%\032\0020\005J&\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÁ\001¢\006\002\b-R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\020R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\021\020\020R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\022\020\020R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\023\020\020R\025\020\b\032\004\030\0010\t¢\006\n\n\002\020\026\032\004\b\024\020\025¨\0061"}, d2 = {"Lai/grazie/model/cloud/sse/ServerSentEvent;", "", "seen1", "", "data", "", "event", "id", "retry", "", "comment", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getData", "getEvent", "getId", "getRetry", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lai/grazie/model/cloud/sse/ServerSentEvent;", "equals", "", "other", "hashCode", "isCommentEvent", "isEmpty", "toString", "toStringEvent", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_cloud", "$serializer", "Builder", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nServerSentEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEvent.kt\nai/grazie/model/cloud/sse/ServerSentEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ControlFlow.kt\nai/grazie/utils/ControlFlowKt\n*L\n1#1,96:1\n1#2:97\n20#3,5:98\n20#3,5:103\n20#3,5:108\n20#3,5:113\n20#3,5:118\n*S KotlinDebug\n*F\n+ 1 ServerSentEvent.kt\nai/grazie/model/cloud/sse/ServerSentEvent\n*L\n28#1:98,5\n29#1:103,5\n30#1:108,5\n31#1:113,5\n32#1:118,5\n*E\n"})
/*    */ public final class ServerSentEvent { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @Nullable
/*    */   private final String data;
/*    */   @Nullable
/*    */   private final String event;
/*    */   @Nullable
/*    */   private final String id;
/*    */   @Nullable
/*    */   private final Long retry;
/*    */   @Nullable
/*    */   private final String comment;
/*    */   
/* 16 */   public ServerSentEvent(@Nullable String data, @Nullable String event, @Nullable String id, @Nullable Long retry, @Nullable String comment) { this.data = data; this.event = event; this.id = id; this.retry = retry; this.comment = comment;
/*    */ 
/*    */     
/* 19 */     if (this.retry != null && !((this.retry.longValue() > 0L) ? 1 : 0))
/*    */     
/*    */     { 
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
/* 97 */       int $i$a$-require-ServerSentEvent$1 = 0; String str = "SSE retry must be positive"; throw new IllegalArgumentException(str.toString()); }  } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/cloud/sse/ServerSentEvent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-cloud"}) public static final class $serializer implements GeneratedSerializer<ServerSentEvent> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)LongSerializer.INSTANCE); arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ServerSentEvent deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null, str3 = null; Long long_ = null; String str4 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x1; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x2; str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x4; long_ = (Long)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LongSerializer.INSTANCE, long_); i |= 0x8; str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str4); i |= 0x10; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x1; continue;case 1: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x2; continue;case 2: str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x4; continue;case 3: long_ = (Long)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LongSerializer.INSTANCE, long_); i |= 0x8; continue;case 4: str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str4); i |= 0x10; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ServerSentEvent(i, str1, str2, str3, long_, str4, null); } public void serialize(@NotNull Encoder encoder, @NotNull ServerSentEvent value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ServerSentEvent.write$Self$model_cloud(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.cloud.sse.ServerSentEvent", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("data", true); pluginGeneratedSerialDescriptor.addElement("event", true); pluginGeneratedSerialDescriptor.addElement("id", true); pluginGeneratedSerialDescriptor.addElement("retry", true); pluginGeneratedSerialDescriptor.addElement("comment", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/ServerSentEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "model-cloud"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ServerSentEvent> serializer() { return (KSerializer<ServerSentEvent>)ServerSentEvent.$serializer.INSTANCE; } } @Nullable public final String getData() { return this.data; } @Nullable public final String getEvent() { return this.event; } @Nullable public final String getId() { return this.id; } @Nullable public final Long getRetry() { return this.retry; } @Nullable public final String getComment() { return this.comment; } public final boolean isEmpty() { return (this.data == null && this.id == null && this.event == null && this.retry == null && this.comment == null); } public final boolean isCommentEvent() { return (this.data == null && this.id == null && this.event == null && this.retry == null && this.comment != null); } @NotNull public final String toStringEvent() { // Byte code:
/*    */     //   0: new java/lang/StringBuilder
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: astore_1
/*    */     //   8: aload_0
/*    */     //   9: getfield comment : Ljava/lang/String;
/*    */     //   12: astore_2
/*    */     //   13: iconst_0
/*    */     //   14: istore_3
/*    */     //   15: aload_2
/*    */     //   16: ifnull -> 50
/*    */     //   19: aload_1
/*    */     //   20: aload_2
/*    */     //   21: astore #4
/*    */     //   23: astore #5
/*    */     //   25: iconst_0
/*    */     //   26: istore #6
/*    */     //   28: aload #5
/*    */     //   30: aload_0
/*    */     //   31: getfield comment : Ljava/lang/String;
/*    */     //   34: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   42: bipush #10
/*    */     //   44: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   47: pop
/*    */     //   48: nop
/*    */     //   49: nop
/*    */     //   50: aload_1
/*    */     //   51: astore_1
/*    */     //   52: aload_0
/*    */     //   53: getfield data : Ljava/lang/String;
/*    */     //   56: astore_2
/*    */     //   57: iconst_0
/*    */     //   58: istore_3
/*    */     //   59: aload_2
/*    */     //   60: ifnull -> 94
/*    */     //   63: aload_1
/*    */     //   64: aload_2
/*    */     //   65: astore #4
/*    */     //   67: astore #5
/*    */     //   69: iconst_0
/*    */     //   70: istore #6
/*    */     //   72: aload #5
/*    */     //   74: aload_0
/*    */     //   75: getfield data : Ljava/lang/String;
/*    */     //   78: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   86: bipush #10
/*    */     //   88: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   91: pop
/*    */     //   92: nop
/*    */     //   93: nop
/*    */     //   94: aload_1
/*    */     //   95: astore_1
/*    */     //   96: aload_0
/*    */     //   97: getfield event : Ljava/lang/String;
/*    */     //   100: astore_2
/*    */     //   101: iconst_0
/*    */     //   102: istore_3
/*    */     //   103: aload_2
/*    */     //   104: ifnull -> 138
/*    */     //   107: aload_1
/*    */     //   108: aload_2
/*    */     //   109: astore #4
/*    */     //   111: astore #5
/*    */     //   113: iconst_0
/*    */     //   114: istore #6
/*    */     //   116: aload #5
/*    */     //   118: aload_0
/*    */     //   119: getfield event : Ljava/lang/String;
/*    */     //   122: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   130: bipush #10
/*    */     //   132: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   135: pop
/*    */     //   136: nop
/*    */     //   137: nop
/*    */     //   138: aload_1
/*    */     //   139: astore_1
/*    */     //   140: aload_0
/*    */     //   141: getfield id : Ljava/lang/String;
/*    */     //   144: astore_2
/*    */     //   145: iconst_0
/*    */     //   146: istore_3
/*    */     //   147: aload_2
/*    */     //   148: ifnull -> 182
/*    */     //   151: aload_1
/*    */     //   152: aload_2
/*    */     //   153: astore #4
/*    */     //   155: astore #5
/*    */     //   157: iconst_0
/*    */     //   158: istore #6
/*    */     //   160: aload #5
/*    */     //   162: aload_0
/*    */     //   163: getfield id : Ljava/lang/String;
/*    */     //   166: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   174: bipush #10
/*    */     //   176: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   179: pop
/*    */     //   180: nop
/*    */     //   181: nop
/*    */     //   182: aload_1
/*    */     //   183: astore_1
/*    */     //   184: aload_0
/*    */     //   185: getfield retry : Ljava/lang/Long;
/*    */     //   188: astore_2
/*    */     //   189: iconst_0
/*    */     //   190: istore_3
/*    */     //   191: aload_2
/*    */     //   192: ifnull -> 232
/*    */     //   195: aload_1
/*    */     //   196: aload_2
/*    */     //   197: checkcast java/lang/Number
/*    */     //   200: invokevirtual longValue : ()J
/*    */     //   203: lstore #4
/*    */     //   205: astore #6
/*    */     //   207: iconst_0
/*    */     //   208: istore #7
/*    */     //   210: aload #6
/*    */     //   212: aload_0
/*    */     //   213: getfield retry : Ljava/lang/Long;
/*    */     //   216: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Long;)Ljava/lang/String;
/*    */     //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   224: bipush #10
/*    */     //   226: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   229: pop
/*    */     //   230: nop
/*    */     //   231: nop
/*    */     //   232: aload_1
/*    */     //   233: bipush #10
/*    */     //   235: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   238: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   241: dup
/*    */     //   242: ldc 'StringBuilder()\\n        …)\\n            .toString()'
/*    */     //   244: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   247: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 0
/*    */     //   #28	-> 8
/*    */     //   #98	-> 15
/*    */     //   #99	-> 19
/*    */     //   #28	-> 28
/*    */     //   #28	-> 48
/*    */     //   #99	-> 49
/*    */     //   #102	-> 50
/*    */     //   #29	-> 52
/*    */     //   #103	-> 59
/*    */     //   #104	-> 63
/*    */     //   #29	-> 72
/*    */     //   #29	-> 92
/*    */     //   #104	-> 93
/*    */     //   #107	-> 94
/*    */     //   #30	-> 96
/*    */     //   #108	-> 103
/*    */     //   #109	-> 107
/*    */     //   #30	-> 116
/*    */     //   #30	-> 136
/*    */     //   #109	-> 137
/*    */     //   #112	-> 138
/*    */     //   #31	-> 140
/*    */     //   #113	-> 147
/*    */     //   #114	-> 151
/*    */     //   #31	-> 160
/*    */     //   #31	-> 180
/*    */     //   #114	-> 181
/*    */     //   #117	-> 182
/*    */     //   #32	-> 184
/*    */     //   #118	-> 191
/*    */     //   #119	-> 195
/*    */     //   #32	-> 210
/*    */     //   #32	-> 230
/*    */     //   #119	-> 231
/*    */     //   #122	-> 232
/*    */     //   #33	-> 233
/*    */     //   #34	-> 238
/*    */     //   #27	-> 247
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   28	21	6	$i$a$-applyIfNotNull-ServerSentEvent$toStringEvent$1	I
/*    */     //   25	24	5	$this$toStringEvent_u24lambda_u241	Ljava/lang/StringBuilder;
/*    */     //   25	24	4	it	Ljava/lang/String;
/*    */     //   15	36	3	$i$f$applyIfNotNull	I
/*    */     //   13	38	1	$this$applyIfNotNull$iv	Ljava/lang/Object;
/*    */     //   13	38	2	value$iv	Ljava/lang/Object;
/*    */     //   72	21	6	$i$a$-applyIfNotNull-ServerSentEvent$toStringEvent$2	I
/*    */     //   69	24	5	$this$toStringEvent_u24lambda_u242	Ljava/lang/StringBuilder;
/*    */     //   69	24	4	it	Ljava/lang/String;
/*    */     //   59	36	3	$i$f$applyIfNotNull	I
/*    */     //   57	38	1	$this$applyIfNotNull$iv	Ljava/lang/Object;
/*    */     //   57	38	2	value$iv	Ljava/lang/Object;
/*    */     //   116	21	6	$i$a$-applyIfNotNull-ServerSentEvent$toStringEvent$3	I
/*    */     //   113	24	5	$this$toStringEvent_u24lambda_u243	Ljava/lang/StringBuilder;
/*    */     //   113	24	4	it	Ljava/lang/String;
/*    */     //   103	36	3	$i$f$applyIfNotNull	I
/*    */     //   101	38	1	$this$applyIfNotNull$iv	Ljava/lang/Object;
/*    */     //   101	38	2	value$iv	Ljava/lang/Object;
/*    */     //   160	21	6	$i$a$-applyIfNotNull-ServerSentEvent$toStringEvent$4	I
/*    */     //   157	24	5	$this$toStringEvent_u24lambda_u244	Ljava/lang/StringBuilder;
/*    */     //   157	24	4	it	Ljava/lang/String;
/*    */     //   147	36	3	$i$f$applyIfNotNull	I
/*    */     //   145	38	1	$this$applyIfNotNull$iv	Ljava/lang/Object;
/*    */     //   145	38	2	value$iv	Ljava/lang/Object;
/*    */     //   210	21	7	$i$a$-applyIfNotNull-ServerSentEvent$toStringEvent$5	I
/*    */     //   207	24	6	$this$toStringEvent_u24lambda_u245	Ljava/lang/StringBuilder;
/*    */     //   207	24	4	it	J
/*    */     //   191	42	3	$i$f$applyIfNotNull	I
/*    */     //   189	44	1	$this$applyIfNotNull$iv	Ljava/lang/Object;
/*    */     //   189	44	2	value$iv	Ljava/lang/Object;
/* 97 */     //   0	248	0	this	Lai/grazie/model/cloud/sse/ServerSentEvent; } @Nullable public final String component1() { return this.data; } @Nullable public final String component2() { return this.event; } @Nullable public final String component3() { return this.id; } @Nullable public final Long component4() { return this.retry; } @Nullable public final String component5() { return this.comment; } @NotNull public final ServerSentEvent copy(@Nullable String data, @Nullable String event, @Nullable String id, @Nullable Long retry, @Nullable String comment) { return new ServerSentEvent(data, event, id, retry, comment); } @NotNull public String toString() { return "ServerSentEvent(data=" + this.data + ", event=" + this.event + ", id=" + this.id + ", retry=" + this.retry + ", comment=" + this.comment + ")"; } public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); result = result * 31 + ((this.event == null) ? 0 : this.event.hashCode()); result = result * 31 + ((this.id == null) ? 0 : this.id.hashCode()); result = result * 31 + ((this.retry == null) ? 0 : this.retry.hashCode()); return result * 31 + ((this.comment == null) ? 0 : this.comment.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ServerSentEvent)) return false;  ServerSentEvent serverSentEvent = (ServerSentEvent)other; return !Intrinsics.areEqual(this.data, serverSentEvent.data) ? false : (!Intrinsics.areEqual(this.event, serverSentEvent.event) ? false : (!Intrinsics.areEqual(this.id, serverSentEvent.id) ? false : (!Intrinsics.areEqual(this.retry, serverSentEvent.retry) ? false : (!!Intrinsics.areEqual(this.comment, serverSentEvent.comment))))); } public ServerSentEvent() { this((String)null, (String)null, (String)null, (Long)null, (String)null, 31, (DefaultConstructorMarker)null); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\021\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\020\t\n\002\b\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\004\030\0002\0020\001B\027\022\020\b\002\020\002\032\n\022\004\022\0020\004\030\0010\003¢\006\002\020\005J\016\020\023\032\0020\0242\006\020\025\032\0020\004J\020\020\026\032\0020\0242\006\020\025\032\0020\004H\002J\006\020\027\032\0020\030J\006\020\031\032\0020\013J\022\020\032\032\004\030\0010\004*\0060\007j\002`\bH\002J\f\020\033\032\0020\004*\0020\004H\002R\022\020\006\032\0060\007j\002`\bX\004¢\006\002\n\000R\022\020\t\032\0060\007j\002`\bX\004¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000R\020\020\f\032\004\030\0010\004X\016¢\006\002\n\000R\020\020\r\032\004\030\0010\004X\016¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\022\020\020\032\004\030\0010\021X\016¢\006\004\n\002\020\022¨\006\034"}, d2 = {"Lai/grazie/model/cloud/sse/ServerSentEvent$Builder;", "", "lines", "", "", "([Ljava/lang/String;)V", "commentBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "dataBuilder", "entire", "", "event", "id", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "retry", "", "Ljava/lang/Long;", "append", "", "line", "appendLine", "build", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "isEntire", "buildSSEText", "trimFirstSpace", "model-cloud"}) @SourceDebugExtension({"SMAP\nServerSentEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEvent.kt\nai/grazie/model/cloud/sse/ServerSentEvent$Builder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n13402#2,2:97\n1#3:99\n*S KotlinDebug\n*F\n+ 1 ServerSentEvent.kt\nai/grazie/model/cloud/sse/ServerSentEvent$Builder\n*L\n49#1:97,2\n*E\n"}) public static final class Builder { @NotNull private final MPPLogger logger; @NotNull private final StringBuilder dataBuilder; @NotNull private final StringBuilder commentBuilder; public Builder(@Nullable String[] lines) { String[] arrayOfString; byte b; int i; this.logger = LoggerFactory.INSTANCE.create("ai.grazie.model.cloud.sse.ServerSentEvent.Builder"); this.dataBuilder = new StringBuilder(); this.commentBuilder = new StringBuilder(); if (lines != null) { arrayOfString = lines; int $i$f$forEach = 0; b = 0; i = arrayOfString.length; } else {  }  if (b < i) { Object element$iv = arrayOfString[b], object1 = element$iv; int $i$a$-forEach-ServerSentEvent$Builder$1 = 0; append((String)object1); }
/*    */        } @Nullable private String event; @Nullable private String id; @Nullable private Long retry; private boolean entire; public final void append(@NotNull String line) { Intrinsics.checkNotNullParameter(line, "line"); if (!(!this.entire ? 1 : 0))
/* 99 */       { int $i$a$-require-ServerSentEvent$Builder$append$1 = 0; String str = "SSE event is already entire"; throw new IllegalArgumentException(str.toString()); }  appendLine(line); } private final void appendLine(String line) { if (!StringsKt.isBlank(line)) { int colonIndex = StringsKt.indexOf$default(line, ":", 0, false, 6, null); Intrinsics.checkNotNullExpressionValue(line.substring(colonIndex + 1), "substring(...)"); Pair pair = (colonIndex == -1) ? TuplesKt.to(line, "") : TuplesKt.to(StringsKt.substring(line, RangesKt.until(0, colonIndex)), trimFirstSpace(line.substring(colonIndex + 1))); String field = (String)pair.component1(), value = (String)pair.component2(); String str1 = field; switch (str1.hashCode()) { case 0: if (!str1.equals("")) break;  this.commentBuilder.append(value).append('\n'); return;case 3076010: if (!str1.equals("data")) break;  this.dataBuilder.append(value).append('\n'); return;case 3355: if (!str1.equals("id")) break;  this.id = value; return;case 96891546: if (!str1.equals("event")) break;  this.event = value; return;case 108405416: if (!str1.equals("retry")) break;  this.retry = Long.valueOf(Long.parseLong(value)); return; }  MPPLogger.error$default(this.logger, null, new ServerSentEvent$Builder$appendLine$1(field), 1, null); } else { this.entire = true; }  } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class ServerSentEvent$Builder$appendLine$1 extends Lambda implements Function0<String> { public final String invoke() { return "Not acceptable SSE event field received: " + this.$field + ", the line skipped. Correct event fields: id, event, data, retry and empty for comments"; } ServerSentEvent$Builder$appendLine$1(String $field) { super(0); } } public final boolean isEntire() { return this.entire; } @NotNull public final ServerSentEvent build() { if (!this.entire) { int $i$a$-require-ServerSentEvent$Builder$build$1 = 0; String str = "SSE event is not entire"; throw new IllegalArgumentException(str.toString()); }  return new ServerSentEvent(buildSSEText(this.dataBuilder), this.event, this.id, this.retry, buildSSEText(this.commentBuilder)); } private final String buildSSEText(StringBuilder $this$buildSSEText) { StringBuilder stringBuilder1 = $this$buildSSEText, it = stringBuilder1; int $i$a$-takeIf-ServerSentEvent$Builder$buildSSEText$1 = 0;
/*    */       (((it.length() > 0)) ? stringBuilder1 : null).toString();
/*    */       return ((((it.length() > 0)) ? stringBuilder1 : null) != null && (((it.length() > 0)) ? stringBuilder1 : null).toString() != null) ? StringsKt.dropLast((((it.length() > 0)) ? stringBuilder1 : null).toString(), 1) : null; }
/*    */ 
/*    */     
/*    */     private final String trimFirstSpace(String $this$trimFirstSpace) {
/*    */       byte b = 32;
/*    */       if (StringsKt.firstOrNull($this$trimFirstSpace) == null) {
/*    */         StringsKt.firstOrNull($this$trimFirstSpace);
/*    */       } else if (StringsKt.firstOrNull($this$trimFirstSpace).charValue() == b) {
/*    */         Intrinsics.checkNotNullExpressionValue($this$trimFirstSpace.substring(1), "substring(...)");
/*    */       } 
/*    */       return $this$trimFirstSpace;
/*    */     }
/*    */     
/*    */     public Builder() {
/*    */       this(null, 1, null);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\ServerSentEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */