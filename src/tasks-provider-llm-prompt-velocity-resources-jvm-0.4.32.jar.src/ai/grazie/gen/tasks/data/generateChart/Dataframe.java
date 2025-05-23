/*    */ package ai.grazie.gen.tasks.data.generateChart;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\030\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 42\0020\001:\00234BY\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\b\001\020\006\032\0020\003\022\020\b\001\020\007\032\n\022\004\022\0020\t\030\0010\b\022\n\b\001\020\n\032\004\030\0010\005\022\n\b\001\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B;\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\f\020\007\032\b\022\004\022\0020\t0\b\022\n\b\002\020\n\032\004\030\0010\005\022\n\b\002\020\013\032\004\030\0010\f¢\006\002\020\020J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\003HÆ\003J\017\020\"\032\b\022\004\022\0020\t0\bHÆ\003J\013\020#\032\004\030\0010\005HÆ\003J\013\020$\032\004\030\0010\fHÆ\003JE\020%\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\016\b\002\020\007\032\b\022\004\022\0020\t0\b2\n\b\002\020\n\032\004\030\0010\0052\n\b\002\020\013\032\004\030\0010\fHÆ\001J\023\020&\032\0020'2\b\020(\032\004\030\0010\001HÖ\003J\t\020)\032\0020\003HÖ\001J\t\020*\032\0020\005HÖ\001J&\020+\032\0020,2\006\020-\032\0020\0002\006\020.\032\0020/2\006\0200\032\00201HÁ\001¢\006\002\b2R\"\020\007\032\b\022\004\022\0020\t0\b8\006X\004¢\006\016\n\000\022\004\b\021\020\022\032\004\b\023\020\024R\036\020\n\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\025\020\022\032\004\b\026\020\027R\034\020\006\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\030\020\022\032\004\b\031\020\032R\036\020\013\032\004\030\0010\f8\006X\004¢\006\016\n\000\022\004\b\033\020\022\032\004\b\034\020\035R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\036\020\022\032\004\b\037\020\027¨\0065"}, d2 = {"Lai/grazie/gen/tasks/data/generateChart/Dataframe;", "", "seen1", "", "variableName", "", "indexColumnWidth", "columns", "", "Lai/grazie/gen/tasks/data/generateChart/Column;", "dimension", "type", "Lai/grazie/gen/tasks/data/generateChart/Type;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Lai/grazie/gen/tasks/data/generateChart/Type;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lai/grazie/gen/tasks/data/generateChart/Type;)V", "getColumns$annotations", "()V", "getColumns", "()Ljava/util/List;", "getDimension$annotations", "getDimension", "()Ljava/lang/String;", "getIndexColumnWidth$annotations", "getIndexColumnWidth", "()I", "getType$annotations", "getType", "()Lai/grazie/gen/tasks/data/generateChart/Type;", "getVariableName$annotations", "getVariableName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class Dataframe {
/*    */   @NotNull
/*    */   private final String variableName;
/*    */   private final int indexColumnWidth;
/*    */   @NotNull
/*    */   private final List<Column> columns;
/*    */   @NotNull
/* 34 */   public static final Companion Companion = new Companion(null); @Nullable
/*    */   private final String dimension; @Nullable
/*    */   private final Type type; @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; public Dataframe(@NotNull String variableName, int indexColumnWidth, @NotNull List<Column> columns, @Nullable String dimension, @Nullable Type type) {
/* 39 */     this.variableName = variableName;
/*    */ 
/*    */     
/* 42 */     this.indexColumnWidth = indexColumnWidth;
/*    */ 
/*    */     
/* 45 */     this.columns = columns;
/*    */ 
/*    */     
/* 48 */     this.dimension = dimension;
/*    */ 
/*    */     
/* 51 */     this.type = type; } @Nullable
/* 52 */   public final Type getType() { return this.type; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)Column.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[3] = null;
/*    */     arrayOfKSerializer[4] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/data/generateChart/Dataframe.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/data/generateChart/Dataframe;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<Dataframe> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])Dataframe.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)Type.$serializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Dataframe deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null;
/*    */       int j = 0;
/*    */       List list = null;
/*    */       String str2 = null;
/*    */       Type type = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])Dataframe.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */         i |= 0x4;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x8;
/*    */         type = (Type)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Type.$serializer.INSTANCE, type);
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
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               type = (Type)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Type.$serializer.INSTANCE, type);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Dataframe(i, str1, j, list, str2, type, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Dataframe value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Dataframe.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.data.generateChart.Dataframe", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("variableName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("indexColumnWidth", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("columns", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("dimension", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("type", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/data/generateChart/Dataframe$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/data/generateChart/Dataframe;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Dataframe> serializer() {
/*    */       return (KSerializer<Dataframe>)Dataframe.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getVariableName() {
/*    */     return this.variableName;
/*    */   }
/*    */   
/*    */   public final int getIndexColumnWidth() {
/*    */     return this.indexColumnWidth;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Column> getColumns() {
/*    */     return this.columns;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getDimension() {
/*    */     return this.dimension;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.variableName;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.indexColumnWidth;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Column> component3() {
/*    */     return this.columns;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.dimension;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Type component5() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Dataframe copy(@NotNull String variableName, int indexColumnWidth, @NotNull List<Column> columns, @Nullable String dimension, @Nullable Type type) {
/*    */     Intrinsics.checkNotNullParameter(variableName, "variableName");
/*    */     Intrinsics.checkNotNullParameter(columns, "columns");
/*    */     return new Dataframe(variableName, indexColumnWidth, columns, dimension, type);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Dataframe(variableName=" + this.variableName + ", indexColumnWidth=" + this.indexColumnWidth + ", columns=" + this.columns + ", dimension=" + this.dimension + ", type=" + this.type + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.variableName.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.indexColumnWidth);
/*    */     result = result * 31 + this.columns.hashCode();
/*    */     result = result * 31 + ((this.dimension == null) ? 0 : this.dimension.hashCode());
/*    */     return result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Dataframe))
/*    */       return false; 
/*    */     Dataframe dataframe = (Dataframe)other;
/*    */     return !Intrinsics.areEqual(this.variableName, dataframe.variableName) ? false : ((this.indexColumnWidth != dataframe.indexColumnWidth) ? false : (!Intrinsics.areEqual(this.columns, dataframe.columns) ? false : (!Intrinsics.areEqual(this.dimension, dataframe.dimension) ? false : (!!Intrinsics.areEqual(this.type, dataframe.type)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\data\generateChart\Dataframe.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */