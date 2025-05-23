/*    */ package ai.grazie.model.jet;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020 \n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\024\020\016\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\fJ\036\020\017\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001H\002J\b\020\024\032\0020\003H\026J\t\020\025\032\0020\026HÖ\001J\f\020\027\032\b\022\004\022\0020\0260\030J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006#"}, d2 = {"Lai/grazie/model/jet/Context;", "", "seen1", "", "items", "", "Lai/grazie/model/jet/ContextItem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/model/jet/ContextItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/model/jet/ContextItem;)V", "getItems", "()[Lai/grazie/model/jet/ContextItem;", "[Lai/grazie/model/jet/ContextItem;", "component1", "copy", "([Lai/grazie/model/jet/ContextItem;)Lai/grazie/model/jet/Context;", "equals", "", "other", "hashCode", "toString", "", "toStringList", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_jet", "$serializer", "Companion", "model-jet"})
/*    */ @SourceDebugExtension({"SMAP\nParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Params.kt\nai/grazie/model/jet/Context\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,41:1\n11158#2:42\n11493#2,3:43\n*S KotlinDebug\n*F\n+ 1 Params.kt\nai/grazie/model/jet/Context\n*L\n23#1:42\n23#1:43,3\n*E\n"})
/*    */ public final class Context {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final ContextItem[] items; @JvmField
/*    */   @NotNull
/*  8 */   private static final KSerializer<Object>[] $childSerializers; public Context(@NotNull ContextItem[] items) { this.items = items; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ContextItem.class), (KSerializer)ContextItem.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final ContextItem[] getItems() { return this.items; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/jet/Context.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/jet/Context;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-jet"}) public static final class $serializer implements GeneratedSerializer<Context> {
/* 10 */     @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])Context.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public Context deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContextItem[] arrayOfContextItem = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])Context.$childSerializers; if (compositeDecoder.decodeSequentially()) { arrayOfContextItem = (ContextItem[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfContextItem); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfContextItem = (ContextItem[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfContextItem); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Context(i, arrayOfContextItem, null); } public void serialize(@NotNull Encoder encoder, @NotNull Context value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Context.write$Self$model_jet(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.jet.Context", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("items", false); descriptor = pluginGeneratedSerialDescriptor; } } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 11 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 13 */     (Context)other;
/*    */     
/* 15 */     return Arrays.equals((Object[])this.items, (Object[])((Context)other).items); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/jet/Context$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/jet/Context;", "model-jet"})
/*    */   public static final class Companion {
/*    */     private Companion() {} @NotNull
/* 19 */     public final KSerializer<Context> serializer() { return (KSerializer<Context>)Context.$serializer.INSTANCE; } } public int hashCode() { return Arrays.hashCode((Object[])this.items); }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> toStringList() {
/* 23 */     ContextItem[] arrayOfContextItem1 = this.items; int $i$f$map = 0;
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
/* 42 */     ContextItem[] arrayOfContextItem2 = arrayOfContextItem1; Collection destination$iv$iv = new ArrayList(arrayOfContextItem1.length); int $i$f$mapTo = 0; byte b; int i;
/* 43 */     for (b = 0, i = arrayOfContextItem2.length; b < i; $this$toStringList_u24lambda_u241_u24lambda_u240 = stringBuilder1 = new StringBuilder(), $i$a$-buildString-Context$toStringList$1$1 = 0) { StringBuilder stringBuilder1, $this$toStringList_u24lambda_u241_u24lambda_u240; int $i$a$-buildString-Context$toStringList$1$1; Object item$iv$iv = arrayOfContextItem2[b];
/* 44 */       Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-Context$toStringList$1 = 0; }
/* 45 */      return (List<String>)destination$iv$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ContextItem[] component1() {
/*    */     return this.items;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Context copy(@NotNull ContextItem[] items) {
/*    */     Intrinsics.checkNotNullParameter(items, "items");
/*    */     return new Context(items);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Context(items=" + Arrays.toString((Object[])this.items) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-jet-jvm-0.4.32.jar!\ai\grazie\model\jet\Context.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */