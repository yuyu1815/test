/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ 
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001:\001!B\007\b\002¢\006\002\020\002R4\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026R\024\020\027\032\0020\030X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\033\032\0020\024X\004¢\006\b\n\000\032\004\b\034\020\026R\024\020\035\032\0020\030X\004¢\006\b\n\000\032\004\b\036\020\032R\024\020\037\032\0020\024X\004¢\006\b\n\000\032\004\b \020\026¨\006\""}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineJetPythonCompleteTask$Schema;", "Lai/grazie/model/task/library/v2/code/completion/JetTaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/OptContext;", "getContext", "()Lai/grazie/model/task/library/code/attributes/OptContext;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "generateIndents", "Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "getGenerateIndents", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "prefix", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getPrefix", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "provideLogitsMetadata", "getProvideLogitsMetadata", "suffix", "getSuffix", "useControl", "getUseControl", "Export", "model-task"})
/*    */ public final class Schema
/*    */   implements JetTaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 50 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 51 */   private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 52 */   private static final AttributeDescriptor.OptText filepath = new AttributeDescriptor.OptText("filepath"); @NotNull public AttributeDescriptor.OptText getFilepath() { return filepath; } @NotNull
/* 53 */   private static final OptContext context = new OptContext("context"); @NotNull public OptContext getContext() { return context; } @NotNull
/* 54 */   private static final AttributeDescriptor.OptBool useControl = new AttributeDescriptor.OptBool("useControl"); @NotNull public AttributeDescriptor.OptBool getUseControl() { return useControl; } @NotNull
/* 55 */   private static final AttributeDescriptor.OptBool provideLogitsMetadata = new AttributeDescriptor.OptBool("provideGenerationDetails"); @NotNull public AttributeDescriptor.OptBool getProvideLogitsMetadata() { return provideLogitsMetadata; } @NotNull
/* 56 */   private static final AttributeDescriptor.OptBool generateIndents = new AttributeDescriptor.OptBool("generateIndents"); @NotNull public AttributeDescriptor.OptBool getGenerateIndents() { return generateIndents; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/* 58 */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[7]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)INSTANCE.getPrefix(); arrayOfAttributeDescriptor[1] = (AttributeDescriptor)INSTANCE.getSuffix(); arrayOfAttributeDescriptor[2] = (AttributeDescriptor)INSTANCE.getFilepath(); arrayOfAttributeDescriptor[3] = (AttributeDescriptor)INSTANCE.getContext(); arrayOfAttributeDescriptor[4] = (AttributeDescriptor)INSTANCE.getUseControl(); arrayOfAttributeDescriptor[5] = (AttributeDescriptor)INSTANCE.getProvideLogitsMetadata(); arrayOfAttributeDescriptor[6] = (AttributeDescriptor)INSTANCE.getGenerateIndents(); all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineJetPythonCompleteTask$Schema$Export;", "", "()V", "metadata", "Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "getMetadata", "()Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "model-task"})
/*    */   public static final class Export { @NotNull
/* 61 */     public static final Export INSTANCE = new Export(); @NotNull private static final CodeCompleteMetadataAttr metadata = CodeCompletionAttributes.INSTANCE.getMetadata(); @NotNull public final CodeCompleteMetadataAttr getMetadata() { return metadata; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeMultiLineJetPythonCompleteTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */