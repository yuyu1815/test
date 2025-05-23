/*    */ package ai.grazie.def;
/*    */ 
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()BI\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB;\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\n\b\002\020\007\032\004\030\0010\005\022\n\b\002\020\b\032\004\030\0010\005\022\n\b\002\020\t\032\004\030\0010\005¢\006\002\020\rJ\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\003HÆ\003J\013\020\027\032\004\030\0010\005HÆ\003J\013\020\030\032\004\030\0010\005HÆ\003J\013\020\031\032\004\030\0010\005HÆ\003JA\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\0052\n\b\002\020\t\032\004\030\0010\005HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\005HÖ\001J&\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÁ\001¢\006\002\b'R\023\020\t\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\017R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\021\020\022R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\023\020\017R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\017¨\006*"}, d2 = {"Lai/grazie/def/WordDefinition$Definition;", "", "seen1", "", "definition", "", "id", "topic", "tags", "content_link", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent_link", "()Ljava/lang/String;", "getDefinition", "getId", "()I", "getTags", "getTopic", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_def", "$serializer", "Companion", "model-def"})
/*    */ public final class Definition {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String definition;
/*    */   private final int id;
/*    */   
/* 19 */   public Definition(@NotNull String definition, int id, @Nullable String topic, @Nullable String tags, @Nullable String content_link) { this.definition = definition;
/* 20 */     this.id = id;
/* 21 */     this.topic = topic;
/* 22 */     this.tags = tags;
/* 23 */     this.content_link = content_link; } @Nullable private final String topic; @Nullable private final String tags; @Nullable private final String content_link; @Nullable public final String getContent_link() { return this.content_link; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/def/WordDefinition.Definition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/def/WordDefinition$Definition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-def"})
/*    */   public static final class $serializer implements GeneratedSerializer<Definition> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public WordDefinition.Definition deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null;
/*    */       int j = 0;
/*    */       String str2 = null, str3 = null, str4 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x4;
/*    */         str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */         i |= 0x8;
/*    */         str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new WordDefinition.Definition(i, str1, j, str2, str3, str4, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull WordDefinition.Definition value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       WordDefinition.Definition.write$Self$model_def(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.def.WordDefinition.Definition", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("definition", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("topic", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("tags", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("content_link", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/def/WordDefinition$Definition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/def/WordDefinition$Definition;", "model-def"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<WordDefinition.Definition> serializer() {
/*    */       return (KSerializer<WordDefinition.Definition>)WordDefinition.Definition.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDefinition() {
/*    */     return this.definition;
/*    */   }
/*    */   
/*    */   public final int getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getTopic() {
/*    */     return this.topic;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getTags() {
/*    */     return this.tags;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.definition;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.topic;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.tags;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.content_link;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Definition copy(@NotNull String definition, int id, @Nullable String topic, @Nullable String tags, @Nullable String content_link) {
/*    */     Intrinsics.checkNotNullParameter(definition, "definition");
/*    */     return new Definition(definition, id, topic, tags, content_link);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Definition(definition=" + this.definition + ", id=" + this.id + ", topic=" + this.topic + ", tags=" + this.tags + ", content_link=" + this.content_link + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.definition.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.id);
/*    */     result = result * 31 + ((this.topic == null) ? 0 : this.topic.hashCode());
/*    */     result = result * 31 + ((this.tags == null) ? 0 : this.tags.hashCode());
/*    */     return result * 31 + ((this.content_link == null) ? 0 : this.content_link.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Definition))
/*    */       return false; 
/*    */     Definition definition = (Definition)other;
/*    */     return !Intrinsics.areEqual(this.definition, definition.definition) ? false : ((this.id != definition.id) ? false : (!Intrinsics.areEqual(this.topic, definition.topic) ? false : (!Intrinsics.areEqual(this.tags, definition.tags) ? false : (!!Intrinsics.areEqual(this.content_link, definition.content_link)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-def-jvm-0.4.32.jar!\ai\grazie\def\WordDefinition$Definition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */