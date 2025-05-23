/*    */ package ai.grazie.model.llm.chat;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Deprecated(message = "Use ai.grazie.model.llm.chat.v5.LLMChat instead", replaceWith = @ReplaceWith(expression = "LLMChat", imports = {"ai.grazie.model.llm.chat.v5.LLMChat"}))
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 '2\0020\001:\003%&'B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\016\b\002\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\024\020\016\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\fJ\036\020\017\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001H\002J\b\020\024\032\0020\003H\026J)\020\025\032\0020\0002!\020\026\032\035\022\023\022\0210\006¢\006\f\b\030\022\b\b\031\022\004\b\b(\032\022\004\022\0020\0060\027J\t\020\033\032\0020\034HÖ\001J&\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÁ\001¢\006\002\b$R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006("}, d2 = {"Lai/grazie/model/llm/chat/LLMChat;", "", "seen1", "", "messages", "", "Lai/grazie/model/llm/chat/LLMChatMessage;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/model/llm/chat/LLMChatMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/model/llm/chat/LLMChatMessage;)V", "getMessages", "()[Lai/grazie/model/llm/chat/LLMChatMessage;", "[Lai/grazie/model/llm/chat/LLMChatMessage;", "component1", "copy", "([Lai/grazie/model/llm/chat/LLMChatMessage;)Lai/grazie/model/llm/chat/LLMChat;", "equals", "", "other", "hashCode", "map", "body", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "message", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Builder", "Companion", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/LLMChat\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,54:1\n11158#2:55\n11493#2,3:56\n37#3:59\n36#3,3:60\n*S KotlinDebug\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/LLMChat\n*L\n36#1:55\n36#1:56,3\n36#1:59\n36#1:60,3\n*E\n"})
/*    */ public final class LLMChat {
/*  9 */   public LLMChat(@NotNull LLMChatMessage[] messages) { this.messages = messages; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/LLMChat.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/LLMChat;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"}) public static final class $serializer implements GeneratedSerializer<LLMChat> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMChat.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LLMChat deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LLMChatMessage[] arrayOfLLMChatMessage = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LLMChat.$childSerializers; if (compositeDecoder.decodeSequentially()) { arrayOfLLMChatMessage = (LLMChatMessage[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfLLMChatMessage); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfLLMChatMessage = (LLMChatMessage[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfLLMChatMessage); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LLMChat(i, arrayOfLLMChatMessage, null); } public void serialize(@NotNull Encoder encoder, @NotNull LLMChat value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LLMChat.write$Self$model_llm(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.LLMChat", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("messages", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final LLMChatMessage[] getMessages() { return this.messages; } @NotNull
/* 10 */   public static final Companion Companion = new Companion(null); @NotNull private final LLMChatMessage[] messages; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(LLMChatMessage.class), (KSerializer)LLMChatMessage.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\tJ\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001¨\006\f"}, d2 = {"Lai/grazie/model/llm/chat/LLMChat$Companion;", "", "()V", "build", "Lai/grazie/model/llm/chat/LLMChat;", "body", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLMChat> serializer() { return (KSerializer<LLMChat>)LLMChat.$serializer.INSTANCE; }
/*    */     @NotNull
/* 12 */     public final LLMChat build(@NotNull Function1 body) { Intrinsics.checkNotNullParameter(body, "body"); LLMChat.Builder builder = new LLMChat.Builder(null, 1, null); body.invoke(builder); return builder.build(); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\030\0002\0020\001B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\030\020\b\032\0020\0002\006\020\t\032\0020\n2\006\020\013\032\0020\003H\007J\016\020\f\032\0020\0002\006\020\013\032\0020\003J\006\020\r\032\0020\016J\026\020\017\032\0020\0002\006\020\t\032\0020\n2\006\020\013\032\0020\003J\016\020\020\032\0020\0002\006\020\013\032\0020\003J\016\020\021\032\0020\0002\006\020\013\032\0020\003R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/model/llm/chat/LLMChat$Builder;", "", "instruction", "", "(Ljava/lang/String;)V", "messages", "Ljava/util/ArrayList;", "Lai/grazie/model/llm/chat/LLMChatMessage;", "add", "role", "Lai/grazie/model/llm/chat/LLMChatRole;", "text", "assistant", "build", "Lai/grazie/model/llm/chat/LLMChat;", "message", "system", "user", "model-llm"})
/*    */   @SourceDebugExtension({"SMAP\nLLMChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/LLMChat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,54:1\n1#2:55\n37#3:56\n36#3,3:57\n*S KotlinDebug\n*F\n+ 1 LLMChat.kt\nai/grazie/model/llm/chat/LLMChat$Builder\n*L\n33#1:56\n33#1:57,3\n*E\n"})
/*    */   public static final class Builder { @NotNull
/*    */     private final ArrayList<LLMChatMessage> messages; public Builder(@Nullable String instruction) {
/*    */       // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: invokespecial <init> : ()V
/*    */       //   4: aload_0
/*    */       //   5: aload_1
/*    */       //   6: dup
/*    */       //   7: ifnull -> 49
/*    */       //   10: astore_2
/*    */       //   11: astore #5
/*    */       //   13: iconst_0
/*    */       //   14: istore_3
/*    */       //   15: iconst_1
/*    */       //   16: anewarray ai/grazie/model/llm/chat/LLMChatMessage
/*    */       //   19: astore #4
/*    */       //   21: aload #4
/*    */       //   23: iconst_0
/*    */       //   24: new ai/grazie/model/llm/chat/LLMChatMessage
/*    */       //   27: dup
/*    */       //   28: getstatic ai/grazie/model/llm/chat/LLMChatRole.System : Lai/grazie/model/llm/chat/LLMChatRole;
/*    */       //   31: aload_2
/*    */       //   32: invokespecial <init> : (Lai/grazie/model/llm/chat/LLMChatRole;Ljava/lang/String;)V
/*    */       //   35: aastore
/*    */       //   36: aload #4
/*    */       //   38: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*    */       //   41: aload #5
/*    */       //   43: swap
/*    */       //   44: nop
/*    */       //   45: dup
/*    */       //   46: ifnonnull -> 57
/*    */       //   49: pop
/*    */       //   50: new java/util/ArrayList
/*    */       //   53: dup
/*    */       //   54: invokespecial <init> : ()V
/*    */       //   57: putfield messages : Ljava/util/ArrayList;
/*    */       //   60: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #16	-> 0
/*    */       //   #17	-> 4
/*    */       //   #55	-> 11
/*    */       //   #17	-> 15
/*    */       //   #17	-> 44
/*    */       //   #17	-> 45
/*    */       //   #17	-> 57
/*    */       //   #16	-> 60
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   15	26	3	$i$a$-let-LLMChat$Builder$messages$1	I
/*    */       //   13	28	2	it	Ljava/lang/String;
/*    */       //   0	61	0	this	Lai/grazie/model/llm/chat/LLMChat$Builder;
/*    */       //   0	61	1	instruction	Ljava/lang/String;
/*    */     } @Deprecated(message = "Use message(role, text) instead", replaceWith = @ReplaceWith(expression = "message(role, text)", imports = {}))
/*    */     @NotNull
/*    */     public final Builder add(@NotNull LLMChatRole role, @NotNull String text) {
/* 20 */       Intrinsics.checkNotNullParameter(role, "role"); Intrinsics.checkNotNullParameter(text, "text"); return message(role, text);
/*    */     } @NotNull
/*    */     public final Builder message(@NotNull LLMChatRole role, @NotNull String text) {
/* 23 */       Intrinsics.checkNotNullParameter(role, "role"); Intrinsics.checkNotNullParameter(text, "text"); this.messages.add(new LLMChatMessage(role, text));
/* 24 */       return this;
/*    */     }
/*    */     @NotNull
/* 27 */     public final Builder user(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMChatRole.User, text); }
/*    */     @NotNull
/* 29 */     public final Builder system(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMChatRole.System, text); }
/*    */     @NotNull
/* 31 */     public final Builder assistant(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMChatRole.Assistant, text); }
/*    */     @NotNull
/* 33 */     public final LLMChat build() { Collection<LLMChatMessage> $this$toTypedArray$iv = this.messages; int $i$f$toTypedArray = 0;
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
/* 57 */       Collection<LLMChatMessage> thisCollection$iv = $this$toTypedArray$iv;
/*    */       
/* 59 */       return new LLMChat(thisCollection$iv.<LLMChatMessage>toArray(new LLMChatMessage[0])); } public Builder() { this(null, 1, null); } }
/* 60 */   @NotNull public final LLMChat map(@NotNull Function1 body) { Intrinsics.checkNotNullParameter(body, "body"); LLMChatMessage[] arrayOfLLMChatMessage1 = this.messages; int $i$f$map = 0; LLMChatMessage[] arrayOfLLMChatMessage2 = arrayOfLLMChatMessage1; Collection<Object> destination$iv$iv = new ArrayList(arrayOfLLMChatMessage1.length); int $i$f$mapTo = 0; byte b; int i; for (b = 0, i = arrayOfLLMChatMessage2.length; b < i; ) { Object item$iv$iv = arrayOfLLMChatMessage2[b]; destination$iv$iv.add(body.invoke(item$iv$iv)); b++; }  List list = (List)destination$iv$iv; int $i$f$toTypedArray = 0; Collection thisCollection$iv = list;
/*    */     
/* 62 */     LLMChatMessage[] arrayOfLLMChatMessage3 = (LLMChatMessage[])thisCollection$iv.toArray((Object[])new LLMChatMessage[0]);
/*    */     return new LLMChat(arrayOfLLMChatMessage3); }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (LLMChat)other;
/*    */     return Arrays.equals((Object[])this.messages, (Object[])((LLMChat)other).messages);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Arrays.hashCode((Object[])this.messages);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMChatMessage[] component1() {
/*    */     return this.messages;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMChat copy(@NotNull LLMChatMessage[] messages) {
/*    */     Intrinsics.checkNotNullParameter(messages, "messages");
/*    */     return new LLMChat(messages);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMChat(messages=" + Arrays.toString((Object[])this.messages) + ")";
/*    */   }
/*    */   
/*    */   public LLMChat() {
/*    */     this((LLMChatMessage[])null, 1, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\LLMChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */