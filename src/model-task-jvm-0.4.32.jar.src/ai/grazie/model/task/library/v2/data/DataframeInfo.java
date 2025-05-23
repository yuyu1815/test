/*    */ package ai.grazie.model.task.library.v2.data;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\022\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\002-.BO\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\016\020\n\032\n\022\004\022\0020\f\030\0010\013\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B9\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\n\b\002\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\f\020\n\032\b\022\004\022\0020\f0\013¢\006\002\020\020J\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\003HÆ\003J\013\020\034\032\004\030\0010\005HÆ\003J\013\020\035\032\004\030\0010\tHÆ\003J\017\020\036\032\b\022\004\022\0020\f0\013HÆ\003JE\020\037\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\t2\016\b\002\020\n\032\b\022\004\022\0020\f0\013HÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\005HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\021\020\022R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\025\020\026R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\027\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\024¨\006/"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataframeInfo;", "", "seen1", "", "variableName", "", "indexColumnWidth", "dimension", "type", "Lai/grazie/model/task/library/v2/data/TypeDescription;", "columns", "", "Lai/grazie/model/task/library/v2/data/ColumnDescription;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Lai/grazie/model/task/library/v2/data/TypeDescription;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/task/library/v2/data/TypeDescription;Ljava/util/List;)V", "getColumns", "()Ljava/util/List;", "getDimension", "()Ljava/lang/String;", "getIndexColumnWidth", "()I", "getType", "()Lai/grazie/model/task/library/v2/data/TypeDescription;", "getVariableName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class DataframeInfo {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final String variableName; private final int indexColumnWidth; @Nullable private final String dimension; @Nullable private final TypeDescription type; @NotNull
/*    */   private final List<ColumnDescription> columns; @JvmField
/*    */   @NotNull
/*  9 */   private static final KSerializer<Object>[] $childSerializers; public DataframeInfo(@NotNull String variableName, int indexColumnWidth, @Nullable String dimension, @Nullable TypeDescription type, @NotNull List<ColumnDescription> columns) { this.variableName = variableName;
/* 10 */     this.indexColumnWidth = indexColumnWidth;
/* 11 */     this.dimension = dimension;
/* 12 */     this.type = type;
/* 13 */     this.columns = columns; } static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = (KSerializer)new ArrayListSerializer((KSerializer)ColumnDescription.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final List<ColumnDescription> getColumns() { return this.columns; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/data/DataframeInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/data/DataframeInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<DataframeInfo> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])DataframeInfo.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)TypeDescription.$serializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = arrayOfKSerializer1[4];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public DataframeInfo deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null;
/*    */       int j = 0;
/*    */       String str2 = null;
/*    */       TypeDescription typeDescription = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])DataframeInfo.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x4;
/*    */         typeDescription = (TypeDescription)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)TypeDescription.$serializer.INSTANCE, typeDescription);
/*    */         i |= 0x8;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list);
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
/*    */               typeDescription = (TypeDescription)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)TypeDescription.$serializer.INSTANCE, typeDescription);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new DataframeInfo(i, str1, j, str2, typeDescription, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull DataframeInfo value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       DataframeInfo.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.v2.data.DataframeInfo", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("variableName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("indexColumnWidth", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("dimension", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("type", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("columns", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataframeInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/data/DataframeInfo;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<DataframeInfo> serializer() {
/*    */       return (KSerializer<DataframeInfo>)DataframeInfo.$serializer.INSTANCE;
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
/*    */   @Nullable
/*    */   public final String getDimension() {
/*    */     return this.dimension;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TypeDescription getType() {
/*    */     return this.type;
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
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.dimension;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TypeDescription component4() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ColumnDescription> component5() {
/*    */     return this.columns;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DataframeInfo copy(@NotNull String variableName, int indexColumnWidth, @Nullable String dimension, @Nullable TypeDescription type, @NotNull List<ColumnDescription> columns) {
/*    */     Intrinsics.checkNotNullParameter(variableName, "variableName");
/*    */     Intrinsics.checkNotNullParameter(columns, "columns");
/*    */     return new DataframeInfo(variableName, indexColumnWidth, dimension, type, columns);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DataframeInfo(variableName=" + this.variableName + ", indexColumnWidth=" + this.indexColumnWidth + ", dimension=" + this.dimension + ", type=" + this.type + ", columns=" + this.columns + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.variableName.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.indexColumnWidth);
/*    */     result = result * 31 + ((this.dimension == null) ? 0 : this.dimension.hashCode());
/*    */     result = result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*    */     return result * 31 + this.columns.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DataframeInfo))
/*    */       return false; 
/*    */     DataframeInfo dataframeInfo = (DataframeInfo)other;
/*    */     return !Intrinsics.areEqual(this.variableName, dataframeInfo.variableName) ? false : ((this.indexColumnWidth != dataframeInfo.indexColumnWidth) ? false : (!Intrinsics.areEqual(this.dimension, dataframeInfo.dimension) ? false : (!Intrinsics.areEqual(this.type, dataframeInfo.type) ? false : (!!Intrinsics.areEqual(this.columns, dataframeInfo.columns)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\data\DataframeInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */