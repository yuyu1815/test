/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\005\030\0002\026\022\004\022\0020\002\022\004\022\0020\003\022\006\022\004\030\0010\0040\001B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\b\020\007\032\0020\002H\026J\024\020\b\032\004\030\0010\0032\b\020\b\032\004\030\0010\004H\026¨\006\t"}, d2 = {"Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "name", "(Ljava/lang/String;)V", "key", "value", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeDescriptor.kt\nai/grazie/utils/attributes/AttributeDescriptor$OptText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
/*    */ public final class OptText
/*    */   extends AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, String>
/*    */ {
/*    */   public OptText(@NotNull String name) {
/* 19 */     super(name, true); } @NotNull
/* 20 */   public Attributes.Key.Text key() { return new Attributes.Key.Text(getName(), null, 2, null); } @Nullable
/* 21 */   public Attributes.Value.Text value(@Nullable String value) { String it = value;
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
/* 85 */     int $i$a$-let-AttributeDescriptor$OptText$value$1 = 0;
/*    */     return (value != null) ? new Attributes.Value.Text(value, null, 2, null) : null; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributeDescriptor$OptText.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */