/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\030\0002\024\022\004\022\0020\002\022\004\022\0020\003\022\004\022\0020\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\020\020\b\032\0020\0032\006\020\b\032\0020\004H\026¨\006\t"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "name", "(Ljava/lang/String;)V", "key", "value", "utils-common"})
/*    */ public final class Text
/*    */   extends AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, String>
/*    */ {
/*    */   public Text(@NotNull String name) {
/* 14 */     super(name, false); } @NotNull
/* 15 */   public Attributes.Key.Text key() { return new Attributes.Key.Text(getName(), null, 2, null); } @NotNull
/* 16 */   public Attributes.Value.Text value(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); return new Attributes.Value.Text(value, null, 2, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$Text.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */