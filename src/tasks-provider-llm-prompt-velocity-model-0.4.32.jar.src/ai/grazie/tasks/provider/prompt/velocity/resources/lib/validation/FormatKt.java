/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.text.Regex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\013\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005\"\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\t\"\024\020\n\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\005\"\024\020\f\032\0020\007XD¢\006\b\n\000\032\004\b\r\020\t\"\024\020\016\032\0020\003X\004¢\006\b\n\000\032\004\b\017\020\005\"\024\020\020\032\0020\007XD¢\006\b\n\000\032\004\b\021\020\t¨\006\022"}, d2 = {"NAME_MAX_LENGTH", "", "NAME_FORMAT", "Lkotlin/text/Regex;", "getNAME_FORMAT", "()Lkotlin/text/Regex;", "NAME_FORMAT_DESCRIPTION", "", "getNAME_FORMAT_DESCRIPTION", "()Ljava/lang/String;", "FUNCTION_NAME_FORMAT", "getFUNCTION_NAME_FORMAT", "FUNCTION_NAME_FORMAT_DESCRIPTION", "getFUNCTION_NAME_FORMAT_DESCRIPTION", "FOLDER_NAME_FORMAT", "getFOLDER_NAME_FORMAT", "FOLDER_NAME_FORMAT_DESCRIPTION", "getFOLDER_NAME_FORMAT_DESCRIPTION", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class FormatKt {
/*    */   public static final int NAME_MAX_LENGTH = 64;
/*    */   @NotNull
/* 11 */   private static final Regex NAME_FORMAT = new Regex("^[a-z][a-z0-9]*(-[a-z0-9]+)*$"); @NotNull public static final Regex getNAME_FORMAT() { return NAME_FORMAT; } @NotNull
/* 12 */   private static final String NAME_FORMAT_DESCRIPTION = "it can contain only latin lowercase symbols or digits, hyphen-separated if needed, and should start with a letter"; @NotNull public static final String getNAME_FORMAT_DESCRIPTION() { return NAME_FORMAT_DESCRIPTION; }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 17 */   private static final Regex FUNCTION_NAME_FORMAT = new Regex("^[a-z][a-z0-9]*(_[a-z0-9]+)*$"); @NotNull public static final Regex getFUNCTION_NAME_FORMAT() { return FUNCTION_NAME_FORMAT; } @NotNull
/* 18 */   private static final String FUNCTION_NAME_FORMAT_DESCRIPTION = "it can contain only latin lowercase symbols or digits, underscore-separated if needed, and should start with a letter"; @NotNull public static final String getFUNCTION_NAME_FORMAT_DESCRIPTION() { return FUNCTION_NAME_FORMAT_DESCRIPTION; }
/*    */    @NotNull
/* 20 */   private static final Regex FOLDER_NAME_FORMAT = new Regex("^[a-zA-Z][a-zA-Z0-9]*(-[a-zA-Z0-9]+)*$"); @NotNull public static final Regex getFOLDER_NAME_FORMAT() { return FOLDER_NAME_FORMAT; } @NotNull
/* 21 */   private static final String FOLDER_NAME_FORMAT_DESCRIPTION = "it can contain only latin symbols or digits, hyphen-separated if needed, and should start with a letter"; @NotNull public static final String getFOLDER_NAME_FORMAT_DESCRIPTION() { return FOLDER_NAME_FORMAT_DESCRIPTION; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\validation\FormatKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */