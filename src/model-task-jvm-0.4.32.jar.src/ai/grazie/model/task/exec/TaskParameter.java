/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0352\0020\001:\002\034\035B5\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\037\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\rJ&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\022\020\023¨\006\036"}, d2 = {"Lai/grazie/model/task/exec/TaskParameter;", "", "seen1", "", "name", "Lai/grazie/utils/attributes/Attributes$Key;", "optional", "", "defaultValue", "Lai/grazie/utils/attributes/Attributes$Value;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/attributes/Attributes$Key;ZLai/grazie/utils/attributes/Attributes$Value;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/attributes/Attributes$Key;ZLai/grazie/utils/attributes/Attributes$Value;)V", "getDefaultValue", "()Lai/grazie/utils/attributes/Attributes$Value;", "getName", "()Lai/grazie/utils/attributes/Attributes$Key;", "getOptional", "()Z", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class TaskParameter
/*    */ {
/*    */   @NotNull
/*    */   private final Attributes.Key name;
/*    */   private final boolean optional;
/*    */   @Nullable
/*    */   private final Attributes.Value defaultValue;
/*    */   @NotNull
/* 72 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; public TaskParameter(@NotNull Attributes.Key name, boolean optional, @Nullable Attributes.Value defaultValue) {
/* 75 */     this.name = name;
/* 76 */     this.optional = optional;
/* 77 */     this.defaultValue = defaultValue; } @Nullable public final Attributes.Value getDefaultValue() { return this.defaultValue; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = Attributes.Key.Companion.serializer();
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = Attributes.Value.Companion.serializer();
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/exec/TaskParameter.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/exec/TaskParameter;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<TaskParameter> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskParameter.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[2]);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public TaskParameter deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Attributes.Key key = null;
/*    */       boolean bool1 = false;
/*    */       Attributes.Value value = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])TaskParameter.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         key = (Attributes.Key)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], key);
/*    */         i |= 0x1;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         value = (Attributes.Value)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], value);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               key = (Attributes.Key)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], key);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               value = (Attributes.Value)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], value);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new TaskParameter(i, key, bool1, value, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull TaskParameter value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       TaskParameter.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.exec.TaskParameter", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("name", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("optional", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("defaultValue", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/exec/TaskParameter$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/exec/TaskParameter;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TaskParameter> serializer() {
/*    */       return (KSerializer<TaskParameter>)TaskParameter.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes.Key getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public final boolean getOptional() {
/*    */     return this.optional;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParameter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */