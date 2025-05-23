/*    */ package ai.grazie.model.task.data;
/*    */ 
/*    */ import ai.grazie.quota.Quota;
/*    */ import ai.grazie.quota.Quota$;
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import ai.grazie.utils.mpp.money.Credit$;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\025\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\t\020\023\032\0020\tHÆ\003J\035\020\024\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\005HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021¨\006%"}, d2 = {"Lai/grazie/model/task/data/TaskStreamQuotaMetaData;", "Lai/grazie/model/task/data/TaskStreamMetaData;", "seen1", "", "content", "", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class TaskStreamQuotaMetaData extends TaskStreamMetaData {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Quota updated;
/*    */   @NotNull
/*    */   private final Credit spent;
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskStreamQuotaMetaData))
/*    */       return false; 
/*    */     TaskStreamQuotaMetaData taskStreamQuotaMetaData = (TaskStreamQuotaMetaData)other;
/*    */     return !Intrinsics.areEqual(this.updated, taskStreamQuotaMetaData.updated) ? false : (!!Intrinsics.areEqual(this.spent, taskStreamQuotaMetaData.spent));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.updated.hashCode();
/*    */     return result * 31 + this.spent.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskStreamQuotaMetaData(updated=" + this.updated + ", spent=" + this.spent + ")";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskStreamQuotaMetaData copy(@NotNull Quota updated, @NotNull Credit spent) {
/*    */     Intrinsics.checkNotNullParameter(updated, "updated");
/*    */     Intrinsics.checkNotNullParameter(spent, "spent");
/*    */     return new TaskStreamQuotaMetaData(updated, spent);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component2() {
/*    */     return this.spent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Quota component1() {
/*    */     return this.updated;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/data/TaskStreamQuotaMetaData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/data/TaskStreamQuotaMetaData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<TaskStreamQuotaMetaData> { @NotNull
/* 67 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Quota$.serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Credit$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TaskStreamQuotaMetaData deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Quota quota = null; Credit credit = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; continue;case 2: credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskStreamQuotaMetaData(i, str, quota, credit, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskStreamQuotaMetaData value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskStreamQuotaMetaData.write$Self$model_task(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.data.TaskStreamQuotaMetaData", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("content", true); pluginGeneratedSerialDescriptor.addElement("updated", false); pluginGeneratedSerialDescriptor.addElement("spent", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/data/TaskStreamQuotaMetaData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/data/TaskStreamQuotaMetaData;", "model-task"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskStreamQuotaMetaData> serializer() { return (KSerializer<TaskStreamQuotaMetaData>)TaskStreamQuotaMetaData.$serializer.INSTANCE; } }
/*    */    @NotNull
/* 69 */   public final Credit getSpent() { return this.spent; } @NotNull public final Quota getUpdated() { return this.updated; } public TaskStreamQuotaMetaData(@NotNull Quota updated, @NotNull Credit spent) { super(null); this.updated = updated; this.spent = spent; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\TaskStreamQuotaMetaData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */