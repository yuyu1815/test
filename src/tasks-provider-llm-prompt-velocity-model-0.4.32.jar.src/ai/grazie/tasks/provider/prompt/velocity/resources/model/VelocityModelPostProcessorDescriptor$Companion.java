/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonCreator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J@\020\004\032\0020\0052\006\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\020\b\002\020\n\032\n\022\004\022\0020\f\030\0010\0132\020\b\002\020\r\032\n\022\004\022\0020\016\030\0010\013H\003¨\006\017"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$Companion;", "", "<init>", "()V", "create", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor;", "kind", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorKind;", "prefix", "", "surroundings", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemovePlainSurroundings$Affixes;", "regexpSurroundings", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$RemoveRegexpSurroundings$Affixes;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ @SourceDebugExtension({"SMAP\nVelocityModelPostProcessorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityModelPostProcessorDescriptor.kt\nai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @JsonCreator
/*    */   @JvmStatic
/*    */   private final VelocityModelPostProcessorDescriptor create(VelocityModelPostProcessorKind kind, String prefix, List surroundings, List regexpSurroundings) {
/*    */     List list;
/* 44 */     switch (WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
/*    */       case 1:
/* 46 */         if (!((surroundings == null && prefix == null && regexpSurroundings == null) ? 1 : 0))
/*    */         
/*    */         { 
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
/* 68 */           int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$1 = 0; String str = "Only predefined quotes are supported"; throw new IllegalArgumentException(str.toString()); } case 2: if (!((prefix != null && surroundings == null && regexpSurroundings == null) ? 1 : 0)) { int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$2 = 0; String str = "Only single prefix is supported"; throw new IllegalArgumentException(str.toString()); } case 3: if (!((prefix == null) ? 1 : 0)) { int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$3 = 0; String str = "Full surroundings definition is required"; throw new IllegalArgumentException(str.toString()); }  if (!((regexpSurroundings == null) ? 1 : 0)) { int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$4 = 0; String str = "For regexp support use `" + VelocityModelPostProcessorKind.RemoveRegexpSurroundings.getJsonValue() + "`"; throw new IllegalArgumentException(str.toString()); }  list = surroundings; if (!(!((list == null || list.isEmpty()) ? 1 : 0) ? 1 : 0)) { int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$5 = 0; String str = "At least one affixes pair is required"; throw new IllegalArgumentException(str.toString()); } case 4: if (!((prefix == null && surroundings == null) ? 1 : 0)) { int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$6 = 0; String str = "Full regexp surroundings definition is required"; throw new IllegalArgumentException(str.toString()); }  list = regexpSurroundings; if (!(!((list == null || list.isEmpty()) ? 1 : 0) ? 1 : 0)) { int $i$a$-require-VelocityModelPostProcessorDescriptor$Companion$create$7 = 0;
/*    */           String str = "At least one regexp affixes pair is required";
/*    */           throw new IllegalArgumentException(str.toString()); }
/*    */       
/*    */     } 
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorDescriptor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */