<h1 align="center">Teste - Pagmob Api</h1>

<div align="center">
  <h3>Tecnologias utilizadas</h3>

  <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img alt="Spring" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
</div>

<br/>

## Descrição

Esta é uma implementação de uma api simples com Spring que consome uma api externa de exemplo da Pagmob para disponibilizar dados de serviços de ônibus.

</br>

## Documentação da API

### Listar dados das rotas de ônibus


```http
GET /services
```

Responde com _status code_ `200` e um _JSON_ como no exemplo abaixo:
```json
{
	"services": [
		{
			"routeCode": "X111",
			"routeMnemonic": "Vitória Régia II e III",
			"companyId": 11111,
			"stopId": 1111111,
			"serviceId": 11111111,
			"serviceMnemonic": "X111 - ATENDIMENTO 2 - VITÓRIA RÉGIA II",
			"predictionType": "ARRIVAL",
			"activeVehicles": 0,
			"scheduledVehicles": 1,
			"messages": [
				{
					"text": "Mensagem qualquer",
					"ts": 1658332192493,
					"companyId": 306,
					"companyType": "AUTHORITY",
					"companyName": "Prefeitura de Sorocaba"
				}
			],
			"vehicles": [
        {
					"plate": "AAA1234",
					"prefix": "1255",
					"wheelchair": true,
					"climatized": false,
					"prediction": 2505,
					"age": 0,
					"type": "SCHEDULE"
				}
      ],
			"hasRealTime": true
		},
  ]
}
```

####
#

## Créditos

-   [Awesome Badges](https://github.com/Envoy-VC/awesome-badges)

## Autores

-   [Danton Matheus](https://github.com/danton03)