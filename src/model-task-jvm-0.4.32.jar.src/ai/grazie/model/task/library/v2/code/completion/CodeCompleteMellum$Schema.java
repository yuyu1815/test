/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.model.task.library.code.attributes.ContextItemArray;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
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
/*    */ @Deprecated(message = "in favour of `ai.grazie.gen.tasks.code.complete.mellum.CodeCompleteMellumTaskParams`, since 08 Jan 2025")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\f\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R&\020\003\032\024\022\020\022\016\022\002\b\003\022\002\b\003\022\002\b\0030\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\021¢\006\b\n\000\032\004\b\024\020\023R\021\020\025\032\0020\026¢\006\b\n\000\032\004\b\025\020\027R\021\020\030\032\0020\r¢\006\b\n\000\032\004\b\031\020\017R\021\020\032\032\0020\r¢\006\b\n\000\032\004\b\033\020\017R\021\020\034\032\0020\r¢\006\b\n\000\032\004\b\035\020\017R\021\020\036\032\0020\021¢\006\b\n\000\032\004\b\037\020\023R\021\020 \032\0020\021¢\006\b\n\000\032\004\b!\020\023¨\006\""}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeCompleteMellum$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "getContext", "()Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "generateIndents", "Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "getGenerateIndents", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "isExplicit", "isMultilineAllowed", "Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "()Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "language", "getLanguage", "prefix", "getPrefix", "suffix", "getSuffix", "useCloneFinder", "getUseCloneFinder", "useControlModel", "getUseControlModel", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 45 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 46 */   private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 47 */   private static final ContextItemArray context = new ContextItemArray("context"); @NotNull public final ContextItemArray getContext() { return context; } @NotNull
/* 48 */   private static final AttributeDescriptor.Text language = new AttributeDescriptor.Text("language"); @NotNull public final AttributeDescriptor.Text getLanguage() { return language; } @NotNull
/* 49 */   private static final AttributeDescriptor.Text filepath = new AttributeDescriptor.Text("filepath"); @NotNull public final AttributeDescriptor.Text getFilepath() { return filepath; } @NotNull
/* 50 */   private static final AttributeDescriptor.Bool isMultilineAllowed = new AttributeDescriptor.Bool("isMultilineAllowed"); @NotNull public final AttributeDescriptor.Bool isMultilineAllowed() { return isMultilineAllowed; } @NotNull
/* 51 */   private static final AttributeDescriptor.OptBool isExplicit = new AttributeDescriptor.OptBool("isExplicit"); @NotNull public final AttributeDescriptor.OptBool isExplicit() { return isExplicit; } @NotNull
/* 52 */   private static final AttributeDescriptor.OptBool useControlModel = new AttributeDescriptor.OptBool("useControlModel"); @NotNull public final AttributeDescriptor.OptBool getUseControlModel() { return useControlModel; } @NotNull
/* 53 */   private static final AttributeDescriptor.OptBool generateIndents = new AttributeDescriptor.OptBool("generateIndents"); @NotNull public final AttributeDescriptor.OptBool getGenerateIndents() { return generateIndents; } @NotNull
/* 54 */   private static final AttributeDescriptor.OptBool useCloneFinder = new AttributeDescriptor.OptBool("useCloneFinder"); @NotNull public final AttributeDescriptor.OptBool getUseCloneFinder() { return useCloneFinder; }
/*    */    @NotNull
/* 56 */   private static final List<AttributeDescriptor<?, ?, ?>> all = new ArrayList<>(); @NotNull public List<AttributeDescriptor<?, ?, ?>> getAll() { return all; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeCompleteMellum$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */