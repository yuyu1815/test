/*    */ package ai.grazie.gen.tasks.vcs.mr.moveToNewFile;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.internal.EnumsKt;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<KSerializer<Object>>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final KSerializer<Object> invoke() {
/* 55 */     String[] arrayOfString = new String[3]; arrayOfString[0] = "CURRENT_FILE_CONTENT"; arrayOfString[1] = "NEW_FILE_CONTENT"; arrayOfString[2] = "NEW_FILE_NAME"; Annotation[][] arrayOfAnnotation = new Annotation[3][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.vcs.mr.moveToNewFile.VcsMoveToNewFileTaskParams.Output", (Enum[])VcsMoveToNewFileTaskParams.Output.values(), arrayOfString, arrayOfAnnotation, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\mr\moveToNewFile\VcsMoveToNewFileTaskParams$Output$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */