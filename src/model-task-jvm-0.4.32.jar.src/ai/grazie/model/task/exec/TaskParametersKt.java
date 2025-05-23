/*     */ package ai.grazie.model.task.exec;
/*     */ 
/*     */ import ai.grazie.model.cloud.exceptions.ExtensionsKt;
/*     */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.ExtensionsKt;
/*     */ import ai.grazie.utils.data.DataHolder;
/*     */ import ai.grazie.utils.data.ExtensionsKt;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\0320\020\005\032\002H\006\"\006\b\000\020\006\030\001*\0020\0072\024\020\b\032\020\022\002\b\003\022\002\b\003\022\004\022\002H\0060\tH\b¢\006\002\020\n\0322\020\013\032\004\030\001H\006\"\006\b\000\020\006\030\001*\0020\0072\024\020\b\032\020\022\002\b\003\022\002\b\003\022\004\022\002H\0060\tH\b¢\006\002\020\n\032\n\020\f\032\0020\r*\0020\007\032\n\020\016\032\0020\007*\0020\r\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004¨\006\017"}, d2 = {"empty", "Lai/grazie/model/task/exec/TaskParameters$Default;", "Lai/grazie/model/task/exec/TaskParameters$Companion;", "getEmpty", "(Lai/grazie/model/task/exec/TaskParameters$Companion;)Lai/grazie/model/task/exec/TaskParameters$Default;", "get", "T", "Lai/grazie/model/task/exec/TaskParameters;", "attr", "Lai/grazie/utils/attributes/AttributeDescriptor;", "(Lai/grazie/model/task/exec/TaskParameters;Lai/grazie/utils/attributes/AttributeDescriptor;)Ljava/lang/Object;", "getOrNull", "toDataHolder", "Lai/grazie/utils/data/DataHolder;", "toTaskParameters", "model-task"})
/*     */ @SourceDebugExtension({"SMAP\nTaskParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskParameters.kt\nai/grazie/model/task/exec/TaskParametersKt\n*L\n1#1,104:1\n88#1,2:105\n*S KotlinDebug\n*F\n+ 1 TaskParameters.kt\nai/grazie/model/task/exec/TaskParametersKt\n*L\n94#1:105,2\n*E\n"})
/*     */ public final class TaskParametersKt
/*     */ {
/*     */   @NotNull
/*     */   public static final TaskParameters.Default getEmpty(@NotNull TaskParameters.Companion $this$empty) {
/*  85 */     Intrinsics.checkNotNullParameter($this$empty, "<this>"); return TaskParametersExtensions.INSTANCE.getEmpty();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TaskParameters toTaskParameters(@NotNull DataHolder $this$toTaskParameters) {
/*  98 */     Intrinsics.checkNotNullParameter($this$toTaskParameters, "<this>"); return new TaskParameters.Default(ExtensionsKt.toAttributes($this$toTaskParameters));
/*     */   }
/*     */   @NotNull
/*     */   public static final DataHolder toDataHolder(@NotNull TaskParameters $this$toDataHolder) {
/* 102 */     Intrinsics.checkNotNullParameter($this$toDataHolder, "<this>"); return ExtensionsKt.toDataHolder($this$toDataHolder.getAttributes());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParametersKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */