def call(boolean abortPipeline = false, boolean evaluateQualityGate = false) {

    echo "Ejecución de las pruebas de calidad de código"
    
    def sonarenv = [:]
    
    timeout(time: 5, unit: 'MINUTES') {
        if (evaluateQualityGate) {
            if (evaluateQualityGate) {
                echo "Quality Gate no aprobado. El pipeline será abortado."
                currentBuild.result = 'FAILURE'
                if (abortPipeline) {
                    error("El pipeline ha sido abortado según la configuración.")
                }
            }
        }
    }
}
