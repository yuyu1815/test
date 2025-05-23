/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable(with = TaskParameters.Serializer.class)
/*    */ @Deprecated(message = "Use DataHolder instead", replaceWith = @ReplaceWith(expression = "DataHolder", imports = {}))
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\007\b'\030\000 \0212\0020\001:\003\021\022\023B\005¢\006\002\020\002J\020\020\f\032\004\030\0010\r2\006\020\016\032\0020\rJ\016\020\017\032\0020\0002\006\020\020\032\0020\000R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006R\027\020\007\032\b\022\004\022\0020\t0\b8F¢\006\006\032\004\b\n\020\013¨\006\024"}, d2 = {"Lai/grazie/model/task/exec/TaskParameters;", "", "()V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "keys", "", "Lai/grazie/utils/attributes/Attributes$Key;", "getKeys", "()[Lai/grazie/utils/attributes/Attributes$Key;", "display", "", "fqdn", "withDefaults", "defaults", "Companion", "Default", "Serializer", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTaskParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskParameters.kt\nai/grazie/model/task/exec/TaskParameters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/*    */ public abstract class TaskParameters {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 24 */   public final Attributes.Key[] getKeys() { return getAttributes().getKeys(); }
/*    */   @NotNull
/*    */   public abstract Attributes getAttributes(); @Nullable
/*    */   public final String display(@NotNull String fqdn) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'fqdn'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokevirtual getKeys : ()[Lai/grazie/utils/attributes/Attributes$Key;
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: aload_2
/*    */     //   14: arraylength
/*    */     //   15: istore #4
/*    */     //   17: iload_3
/*    */     //   18: iload #4
/*    */     //   20: if_icmpge -> 58
/*    */     //   23: aload_2
/*    */     //   24: iload_3
/*    */     //   25: aaload
/*    */     //   26: astore #5
/*    */     //   28: aload #5
/*    */     //   30: astore #6
/*    */     //   32: iconst_0
/*    */     //   33: istore #7
/*    */     //   35: aload #6
/*    */     //   37: invokevirtual getFqdn : ()Ljava/lang/String;
/*    */     //   40: aload_1
/*    */     //   41: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   44: ifeq -> 52
/*    */     //   47: aload #5
/*    */     //   49: goto -> 59
/*    */     //   52: iinc #3, 1
/*    */     //   55: goto -> 17
/*    */     //   58: aconst_null
/*    */     //   59: dup
/*    */     //   60: ifnull -> 89
/*    */     //   63: astore_2
/*    */     //   64: iconst_0
/*    */     //   65: istore_3
/*    */     //   66: aload_0
/*    */     //   67: invokevirtual getAttributes : ()Lai/grazie/utils/attributes/Attributes;
/*    */     //   70: aload_2
/*    */     //   71: invokevirtual get : (Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;
/*    */     //   74: dup
/*    */     //   75: ifnull -> 84
/*    */     //   78: invokevirtual getDisplay : ()Ljava/lang/String;
/*    */     //   81: goto -> 86
/*    */     //   84: pop
/*    */     //   85: aconst_null
/*    */     //   86: goto -> 91
/*    */     //   89: pop
/*    */     //   90: aconst_null
/*    */     //   91: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 6
/*    */     //   #105	-> 32
/*    */     //   #26	-> 35
/*    */     //   #26	-> 44
/*    */     //   #26	-> 59
/*    */     //   #105	-> 64
/*    */     //   #26	-> 66
/*    */     //   #26	-> 86
/*    */     //   #26	-> 89
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   35	9	7	$i$a$-find-TaskParameters$display$1	I
/*    */     //   32	12	6	it	Lai/grazie/utils/attributes/Attributes$Key;
/*    */     //   66	20	3	$i$a$-let-TaskParameters$display$2	I
/*    */     //   64	22	2	it	Lai/grazie/utils/attributes/Attributes$Key;
/*    */     //   0	92	0	this	Lai/grazie/model/task/exec/TaskParameters;
/*    */     //   0	92	1	fqdn	Ljava/lang/String; } @NotNull
/* 28 */   public final TaskParameters withDefaults(@NotNull TaskParameters defaults) { Intrinsics.checkNotNullParameter(defaults, "defaults"); return new Default(defaults.getAttributes().plus(getAttributes())); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\tJ\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001¨\006\f"}, d2 = {"Lai/grazie/model/task/exec/TaskParameters$Companion;", "", "()V", "build", "Lai/grazie/model/task/exec/TaskParameters;", "builder", "Lkotlin/Function1;", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-task"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 30 */     public final KSerializer<TaskParameters> serializer() { return TaskParameters.Serializer.INSTANCE; } @NotNull
/*    */     public final TaskParameters build(@NotNull Function1 builder) {
/* 32 */       Intrinsics.checkNotNullParameter(builder, "builder"); TaskParametersBuilder taskParametersBuilder = new TaskParametersBuilder(); builder.invoke(taskParametersBuilder); return taskParametersBuilder.build$model_task();
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/model/task/exec/TaskParameters$Default;", "Lai/grazie/model/task/exec/TaskParameters;", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)V", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "equals", "", "other", "", "hashCode", "", "model-task"})
/*    */   public static final class Default extends TaskParameters { @NotNull
/*    */     private final Attributes attributes;
/* 36 */     public Default(@NotNull Attributes attributes) { this.attributes = attributes; } @NotNull public Attributes getAttributes() { return this.attributes; }
/*    */      public boolean equals(@Nullable Object other) {
/* 38 */       if (this == other) return true; 
/* 39 */       if (other == null || getClass() != other.getClass()) return false;
/*    */       
/* 41 */       (Default)other;
/*    */       
/* 43 */       return Intrinsics.areEqual(getAttributes(), ((Default)other).getAttributes());
/*    */     }
/*    */     
/*    */     public int hashCode() {
/* 47 */       return getAttributes().hashCode();
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/model/task/exec/TaskParameters$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/exec/TaskParameters;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class Serializer implements KSerializer<TaskParameters> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer();
/*    */     @NotNull
/*    */     public TaskParameters deserialize(@NotNull Decoder decoder) {
/* 53 */       Intrinsics.checkNotNullParameter(decoder, "decoder"); return new TaskParameters.Default((Attributes)decoder.decodeSerializableValue((DeserializationStrategy)Attributes.Companion.serializer()));
/*    */     } @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 56 */       return SerialDescriptorsKt.SerialDescriptor("TaskParameters", Attributes.Companion.serializer().getDescriptor());
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull TaskParameters value) {
/* 59 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeSerializableValue((SerializationStrategy)Attributes.Companion.serializer(), value.getAttributes());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */