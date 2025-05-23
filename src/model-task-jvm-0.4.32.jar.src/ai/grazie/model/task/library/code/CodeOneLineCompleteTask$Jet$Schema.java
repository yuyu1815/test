/*    */ package ai.grazie.model.task.library.code;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.model.task.library.code.attributes.CodeCompleteMetadataAttr;
/*    */ import ai.grazie.model.task.library.code.attributes.CodeCompletionAttributes;
/*    */ import ai.grazie.model.task.library.code.attributes.OptContext;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001:\001\"B\007\b\002¢\006\002\020\002R:\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\025¢\006\b\n\000\032\004\b\026\020\027R\021\020\030\032\0020\031¢\006\b\n\000\032\004\b\032\020\033R\021\020\034\032\0020\025¢\006\b\n\000\032\004\b\035\020\027R\021\020\036\032\0020\031¢\006\b\n\000\032\004\b\037\020\033R\021\020 \032\0020\025¢\006\b\n\000\032\004\b!\020\027¨\006#"}, d2 = {"Lai/grazie/model/task/library/code/CodeOneLineCompleteTask$Jet$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/OptContext;", "getContext", "()Lai/grazie/model/task/library/code/attributes/OptContext;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "generateIndents", "Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "getGenerateIndents", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "prefix", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getPrefix", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "provideLogitsMetadata", "getProvideLogitsMetadata", "suffix", "getSuffix", "useControl", "getUseControl", "Export", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 38 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 39 */   private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 40 */   private static final AttributeDescriptor.OptText filepath = new AttributeDescriptor.OptText("filepath"); @NotNull public final AttributeDescriptor.OptText getFilepath() { return filepath; } @NotNull
/* 41 */   private static final OptContext context = new OptContext("context"); @NotNull public final OptContext getContext() { return context; } @NotNull
/* 42 */   private static final AttributeDescriptor.OptBool useControl = new AttributeDescriptor.OptBool("useControl"); @NotNull public final AttributeDescriptor.OptBool getUseControl() { return useControl; } @NotNull
/* 43 */   private static final AttributeDescriptor.OptBool provideLogitsMetadata = new AttributeDescriptor.OptBool("provideGenerationDetails"); @NotNull public final AttributeDescriptor.OptBool getProvideLogitsMetadata() { return provideLogitsMetadata; } @NotNull
/* 44 */   private static final AttributeDescriptor.OptBool generateIndents = new AttributeDescriptor.OptBool("generateIndents"); @NotNull public final AttributeDescriptor.OptBool getGenerateIndents() { return generateIndents; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/*    */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() {
/* 47 */     return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[7]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)prefix; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)suffix; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)filepath; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)context; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)useControl; arrayOfAttributeDescriptor[5] = (AttributeDescriptor)provideLogitsMetadata; arrayOfAttributeDescriptor[6] = (AttributeDescriptor)generateIndents; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/code/CodeOneLineCompleteTask$Jet$Schema$Export;", "", "()V", "metadata", "Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "getMetadata", "()Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "model-task"})
/*    */   public static final class Export { @NotNull
/* 50 */     public static final Export INSTANCE = new Export(); @NotNull private static final CodeCompleteMetadataAttr metadata = CodeCompletionAttributes.INSTANCE.getMetadata(); @NotNull public final CodeCompleteMetadataAttr getMetadata() { return metadata; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeOneLineCompleteTask$Jet$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */