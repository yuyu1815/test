/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\036\n\002\b\003\n\002\020\000\n\002\b\006\n\002\020(\n\002\b\002\n\002\020*\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\b\030\000 32\b\022\004\022\0020\0020\001:\0041234B)\b\021\022\006\020\003\032\0020\004\022\016\020\005\032\n\022\004\022\0020\002\030\0010\001\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\023\022\f\020\005\032\b\022\004\022\0020\0020\001¢\006\002\020\tJ\017\020\017\032\b\022\004\022\0020\0020\001HÆ\003J\021\020\020\032\0020\0212\006\020\022\032\0020\002H\003J\027\020\023\032\0020\0212\f\020\024\032\b\022\004\022\0020\0020\025H\001J\031\020\026\032\0020\0002\016\b\002\020\005\032\b\022\004\022\0020\0020\001HÆ\001J\023\020\027\032\0020\0212\b\020\030\032\004\030\0010\031HÖ\003J\021\020\032\032\0020\0022\006\020\033\032\0020\004H\003J\t\020\034\032\0020\004HÖ\001J\021\020\035\032\0020\0042\006\020\022\032\0020\002H\001J\t\020\036\032\0020\021H\001J\017\020\037\032\b\022\004\022\0020\0020 H\003J\021\020!\032\0020\0042\006\020\022\032\0020\002H\001J\017\020\"\032\b\022\004\022\0020\0020#H\001J\027\020\"\032\b\022\004\022\0020\0020#2\006\020\033\032\0020\004H\001J\037\020$\032\b\022\004\022\0020\0020\0012\006\020%\032\0020\0042\006\020&\032\0020\004H\001J\t\020'\032\0020(HÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0R\027\020\005\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\n\020\013R\022\020\f\032\0020\004X\005¢\006\006\032\004\b\r\020\016¨\0065"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "seen1", "", "messages", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "size", "getSize", "()I", "component1", "contains", "", "element", "containsAll", "elements", "", "copy", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Builder", "Companion", "ContentBuilder", "model-llm"})
/*    */ public final class LLMMultiModalChat implements List<LLMMultiModalChatMessage>, KMappedMarker {
/* 13 */   public LLMMultiModalChat(@NotNull List<LLMMultiModalChatMessage> messages) { this.messages = messages; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/multimodal/LLMMultiModalChat.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"}) public static final class $serializer implements GeneratedSerializer<LLMMultiModalChat> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMMultiModalChat.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LLMMultiModalChat deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LLMMultiModalChat.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LLMMultiModalChat(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull LLMMultiModalChat value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LLMMultiModalChat.write$Self$model_llm(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.multimodal.LLMMultiModalChat", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("messages", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final List<LLMMultiModalChatMessage> getMessages() { return this.messages; } @MultiModal
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\020\020\b\032\0020\0002\006\020\t\032\0020\003H\007J\006\020\n\032\0020\013J'\020\f\032\0020\0002\006\020\r\032\0020\0162\027\020\017\032\023\022\004\022\0020\021\022\004\022\0020\0220\020¢\006\002\b\023J\030\020\f\032\0020\0002\006\020\r\032\0020\0162\006\020\t\032\0020\003H\002J\020\020\024\032\0020\0002\006\020\t\032\0020\003H\007J\037\020\025\032\0020\0002\027\020\017\032\023\022\004\022\0020\021\022\004\022\0020\0220\020¢\006\002\b\023J\020\020\025\032\0020\0002\006\020\t\032\0020\003H\007R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;", "", "instruction", "", "(Ljava/lang/String;)V", "messages", "Ljava/util/ArrayList;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "assistant", "text", "build", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "message", "role", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "content", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$ContentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "system", "user", "model-llm"})
/*    */   @SourceDebugExtension({"SMAP\nLLMMultiModalChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMMultiModalChat.kt\nai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/*    */   public static final class Builder { @NotNull
/*    */     private final ArrayList<LLMMultiModalChatMessage> messages; public Builder(@Nullable String instruction) {
/*    */       // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: invokespecial <init> : ()V
/*    */       //   4: aload_0
/*    */       //   5: aload_1
/*    */       //   6: dup
/*    */       //   7: ifnull -> 59
/*    */       //   10: astore_2
/*    */       //   11: astore #5
/*    */       //   13: iconst_0
/*    */       //   14: istore_3
/*    */       //   15: iconst_1
/*    */       //   16: anewarray ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage
/*    */       //   19: astore #4
/*    */       //   21: aload #4
/*    */       //   23: iconst_0
/*    */       //   24: new ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage
/*    */       //   27: dup
/*    */       //   28: getstatic ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole.Assistant : Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;
/*    */       //   31: new ai/grazie/model/llm/chat/multimodal/TextElement
/*    */       //   34: dup
/*    */       //   35: aload_2
/*    */       //   36: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   39: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */       //   42: invokespecial <init> : (Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;Ljava/util/List;)V
/*    */       //   45: aastore
/*    */       //   46: aload #4
/*    */       //   48: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*    */       //   51: aload #5
/*    */       //   53: swap
/*    */       //   54: nop
/*    */       //   55: dup
/*    */       //   56: ifnonnull -> 67
/*    */       //   59: pop
/*    */       //   60: new java/util/ArrayList
/*    */       //   63: dup
/*    */       //   64: invokespecial <init> : ()V
/*    */       //   67: putfield messages : Ljava/util/ArrayList;
/*    */       //   70: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #15	-> 0
/*    */       //   #18	-> 4
/*    */       //   #98	-> 11
/*    */       //   #18	-> 15
/*    */       //   #18	-> 54
/*    */       //   #18	-> 55
/*    */       //   #18	-> 67
/*    */       //   #16	-> 70
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   15	36	3	$i$a$-let-LLMMultiModalChat$Builder$messages$1	I
/*    */       //   13	38	2	it	Ljava/lang/String;
/*    */       //   0	71	0	this	Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;
/*    */       //   0	71	1	instruction	Ljava/lang/String;
/*    */     } @NotNull
/*    */     public final Builder system(@NotNull String text) {
/* 21 */       Intrinsics.checkNotNullParameter(text, "text"); return message(LLMMultiModalChatRole.System, text);
/*    */     } @NotNull
/*    */     public final Builder assistant(@NotNull String text) {
/* 24 */       Intrinsics.checkNotNullParameter(text, "text"); return message(LLMMultiModalChatRole.Assistant, text);
/*    */     }
/*    */     @NotNull
/* 27 */     public final Builder user(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return message(LLMMultiModalChatRole.User, text); } @NotNull
/*    */     public final Builder user(@NotNull Function1<? super LLMMultiModalChat.ContentBuilder, Unit> content) {
/* 29 */       Intrinsics.checkNotNullParameter(content, "content"); return message(LLMMultiModalChatRole.User, content);
/*    */     }
/*    */     @NotNull
/*    */     public final Builder message(@NotNull LLMMultiModalChatRole role, @NotNull Function1 content) {
/* 33 */       Intrinsics.checkNotNullParameter(role, "role"); Intrinsics.checkNotNullParameter(content, "content"); LLMMultiModalChat.ContentBuilder contentBuilder = new LLMMultiModalChat.ContentBuilder(); content.invoke(contentBuilder); this.messages.add(new LLMMultiModalChatMessage(role, contentBuilder.build()));
/* 34 */       return this;
/*    */     }
/*    */     
/*    */     private final Builder message(LLMMultiModalChatRole role, String text) {
/* 38 */       this.messages.add(new LLMMultiModalChatMessage(role, CollectionsKt.listOf(new TextElement(text))));
/* 39 */       return this;
/*    */     }
/*    */     @NotNull
/* 42 */     public final LLMMultiModalChat build() { return new LLMMultiModalChat(this.messages); } public Builder() {
/*    */       this(null, 1, null);
/*    */     } } @NotNull
/* 45 */   public static final Companion Companion = new Companion(null); @NotNull private final List<LLMMultiModalChatMessage> messages; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)LLMMultiModalChatMessage.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public int getSize() { return this.messages.size(); } public boolean contains(@NotNull LLMMultiModalChatMessage element) { Intrinsics.checkNotNullParameter(element, "element"); return this.messages.contains(element); } public boolean containsAll(@NotNull Collection<?> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return this.messages.containsAll(elements); } @NotNull public LLMMultiModalChatMessage get(int index) { return this.messages.get(index); } public int indexOf(@NotNull LLMMultiModalChatMessage element) { Intrinsics.checkNotNullParameter(element, "element"); return this.messages.indexOf(element); } public boolean isEmpty() { return this.messages.isEmpty(); } @NotNull public Iterator<LLMMultiModalChatMessage> iterator() { return this.messages.iterator(); } public int lastIndexOf(@NotNull LLMMultiModalChatMessage element) { Intrinsics.checkNotNullParameter(element, "element"); return this.messages.lastIndexOf(element); } @NotNull public ListIterator<LLMMultiModalChatMessage> listIterator() { return this.messages.listIterator(); } @NotNull public ListIterator<LLMMultiModalChatMessage> listIterator(int index) { return this.messages.listIterator(index); } @NotNull public List<LLMMultiModalChatMessage> subList(int fromIndex, int toIndex) { return this.messages.subList(fromIndex, toIndex); } @NotNull public final List<LLMMultiModalChatMessage> component1() { return this.messages; } @NotNull public final LLMMultiModalChat copy(@NotNull List<LLMMultiModalChatMessage> messages) { Intrinsics.checkNotNullParameter(messages, "messages"); return new LLMMultiModalChat(messages); } @NotNull public String toString() { return "LLMMultiModalChat(messages=" + this.messages + ")"; } public int hashCode() { return this.messages.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LLMMultiModalChat)) return false;  LLMMultiModalChat lLMMultiModalChat = (LLMMultiModalChat)other; return !!Intrinsics.areEqual(this.messages, lLMMultiModalChat.messages); } public boolean add(LLMMultiModalChatMessage element) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public void add(int index, LLMMultiModalChatMessage element) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public boolean addAll(Collection elements) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public boolean addAll(int index, Collection elements) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public void clear() { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public boolean remove(Object element) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public boolean removeAll(Collection elements) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public LLMMultiModalChatMessage remove(int index) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public void replaceAll(UnaryOperator p0) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public boolean retainAll(Collection elements) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public LLMMultiModalChatMessage set(int index, LLMMultiModalChatMessage element) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public void sort(Comparator p0) { throw new UnsupportedOperationException("Operation is not supported for read-only collection"); } public <T> T[] toArray(Object[] array) { Intrinsics.checkNotNullParameter(array, "array"); return (T[])CollectionToArray.toArray(this, array); } public Object[] toArray() { return CollectionToArray.toArray(this); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J%\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\tH\bø\001\000J\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001\002\007\n\005\b20\001¨\006\f"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Companion;", "", "()V", "build", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "body", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"}) public static final class Companion { @NotNull public final KSerializer<LLMMultiModalChat> serializer() { return (KSerializer<LLMMultiModalChat>)LLMMultiModalChat.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */     public final LLMMultiModalChat build(@NotNull Function1 body) {
/* 47 */       Intrinsics.checkNotNullParameter(body, "body"); int $i$f$build = 0; LLMMultiModalChat.Builder builder = new LLMMultiModalChat.Builder(null, 1, null); body.invoke(builder); return builder.build();
/*    */     } }
/*    */   @MultiModal
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\022\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\f\020\006\032\b\022\004\022\0020\0050\004J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\007J\016\020\r\032\0020\b2\006\020\r\032\0020\016R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$ContentBuilder;", "", "()V", "content", "", "Lai/grazie/model/llm/chat/multimodal/ContentElement;", "build", "media", "", "type", "Lai/grazie/model/cloud/ContentType;", "data", "", "text", "", "model-llm"})
/*    */   public static final class ContentBuilder { @NotNull
/*    */     private final List<ContentElement> content;
/*    */     public ContentBuilder() {
/* 54 */       this.content = new ArrayList<>();
/*    */     } public final boolean text(@NotNull String text) {
/* 56 */       Intrinsics.checkNotNullParameter(text, "text"); return this.content.add(new TextElement(text));
/*    */     }
/*    */     public final boolean media(@NotNull ContentType type, @NotNull byte[] data) {
/* 59 */       Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(data, "data"); return this.content.add(InlineMediaElement.Companion.ofBytes(type, data));
/*    */     } @NotNull
/*    */     public final List<ContentElement> build() {
/* 62 */       return this.content;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\LLMMultiModalChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */